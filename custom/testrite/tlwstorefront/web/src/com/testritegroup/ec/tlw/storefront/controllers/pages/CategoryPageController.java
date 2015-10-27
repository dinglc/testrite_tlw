/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */
package com.testritegroup.ec.tlw.storefront.controllers.pages;


import de.hybris.platform.acceleratorservices.controllers.page.PageType;
import de.hybris.platform.acceleratorservices.data.RequestContextData;
import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractCategoryPageController;
import de.hybris.platform.acceleratorstorefrontcommons.util.MetaSanitizerUtil;
import de.hybris.platform.acceleratorstorefrontcommons.util.XSSFilterUtil;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.CategoryPageModel;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commercefacades.search.data.SearchStateData;
import de.hybris.platform.commerceservices.search.facetdata.FacetRefinement;
import de.hybris.platform.commerceservices.search.facetdata.ProductCategorySearchPageData;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testritegroup.ec.tlw.storefront.BreadcrumbBuilder.SearchCategoryPageBreadcrumbBuilder;


/**
 * Controller for a category page
 */
@Controller
@Scope("tenant")
@RequestMapping(value = "/**/c")
public class CategoryPageController extends AbstractCategoryPageController
{
	protected static final Logger LOG = Logger.getLogger(CategoryPageController.class);

	protected static final String SUBCATEGORYPAGE = "CategoryPage-";
	protected static final String PRODUCT_LIST_LAND_PAGE = "ProductListPage";

	@Resource(name = "searchCategoryPageBreadcrumbBuilder")
	private SearchCategoryPageBreadcrumbBuilder searchCategoryPageBreadcrumbBuilder;

	@RequestMapping(value = CATEGORY_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String category(@PathVariable("categoryCode") final String categoryCode,
			@RequestParam(value = "q", required = false) final String searchQuery,
			@RequestParam(value = "page", defaultValue = "0") final int page,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode, final Model model,
			final HttpServletRequest request, final HttpServletResponse response) throws UnsupportedEncodingException,
			CMSItemNotFoundException
	{

		final CategoryModel category = getCommerceCategoryService().getCategoryForCode(categoryCode);

		final String redirection = checkRequestUrl(request, response, getCategoryModelUrlResolver().resolve(category));
		if (StringUtils.isNotEmpty(redirection))
		{
			return redirection;
		}

		final ProductCategorySearchPageData<SearchStateData, ProductData, CategoryData> searchPageData = getProductSearchFacade()
				.categorySearch(categoryCode);
		if (CollectionUtils.isNotEmpty(searchPageData.getSubCategories()))
		{
			storeCmsPageInModel(model, getContentPageForLabelOrId(SUBCATEGORYPAGE + categoryCode));
			setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SUBCATEGORYPAGE + categoryCode));

			final Map<String, List<CategoryData>> categoryList = new HashMap<String, List<CategoryData>>();
			for (final CategoryData categorydata : searchPageData.getSubCategories())
			{
				final String midCategoryCode = categorydata.getCode();

				final ProductCategorySearchPageData<SearchStateData, ProductData, CategoryData> midSearchPageData = getProductSearchFacade()
						.categorySearch(midCategoryCode);
				categoryList.put(categorydata.getName(), midSearchPageData.getSubCategories());
			}

			model.addAttribute(WebConstants.BREADCRUMBS_KEY,
					searchCategoryPageBreadcrumbBuilder.getBreadcrumbs(categoryCode, searchPageData));
			model.addAttribute("midcategories", categoryList);
			updatePageTitle(category, searchPageData.getBreadcrumbs(), model);
			return getViewForPage(model);
		}
		return performSearchAndGetResultsPage(categoryCode, searchQuery, page, showMode, sortCode, model, request, response);
	}

	@ResponseBody
	@RequestMapping(value = CATEGORY_CODE_PATH_VARIABLE_PATTERN + "/facets", method = RequestMethod.GET)
	public FacetRefinement<SearchStateData> getFacets(@PathVariable("categoryCode") final String categoryCode,
			@RequestParam(value = "q", required = false) final String searchQuery,
			@RequestParam(value = "page", defaultValue = "0") final int page,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode) throws UnsupportedEncodingException
	{
		return performSearchAndGetFacets(categoryCode, searchQuery, page, showMode, sortCode);
	}

	@ResponseBody
	@RequestMapping(value = CATEGORY_CODE_PATH_VARIABLE_PATTERN + "/results", method = RequestMethod.GET)
	public SearchResultsData<ProductData> getResults(@PathVariable("categoryCode") final String categoryCode,
			@RequestParam(value = "q", required = false) final String searchQuery,
			@RequestParam(value = "page", defaultValue = "0") final int page,
			@RequestParam(value = "show", defaultValue = "Page") final ShowMode showMode,
			@RequestParam(value = "sort", required = false) final String sortCode) throws UnsupportedEncodingException
	{
		return performSearchAndGetResultsData(categoryCode, searchQuery, page, showMode, sortCode);
	}

	@Override
	protected String performSearchAndGetResultsPage(final String categoryCode, final String searchQuery, final int page,
			final ShowMode showMode, final String sortCode, final Model model, final HttpServletRequest request,
			final HttpServletResponse response) throws UnsupportedEncodingException
	{
		final CategoryModel category = getCommerceCategoryService().getCategoryForCode(categoryCode);

		final String redirection = checkRequestUrl(request, response, getCategoryModelUrlResolver().resolve(category));
		if (StringUtils.isNotEmpty(redirection))
		{
			return redirection;
		}

		final CategoryPageModel categoryPage = getCategoryPage(category);

		final CategorySearchEvaluator categorySearch = new CategorySearchEvaluator(categoryCode, XSSFilterUtil.filter(searchQuery),
				page, showMode, sortCode, categoryPage);
		categorySearch.doSearch();

		final ProductCategorySearchPageData<SearchStateData, ProductData, CategoryData> searchPageData = categorySearch
				.getSearchPageData();
		final boolean showCategoriesOnly = categorySearch.isShowCategoriesOnly();
		try
		{
			storeCmsPageInModel(model, getContentPageForLabelOrId(PRODUCT_LIST_LAND_PAGE));
		}
		catch (final CMSItemNotFoundException e)
		{
			e.getMessage();
		}
		storeContinueUrl(request);

		final Map<String, List<CategoryData>> categoryList = new HashMap<String, List<CategoryData>>();
		final String mainCategoryCode = getCommerceCategoryService().getPathsForCategory(category).iterator().next().get(1)
				.getCode();
		final ProductCategorySearchPageData<SearchStateData, ProductData, CategoryData> mainSearchPageData = getProductSearchFacade()
				.categorySearch(mainCategoryCode);
		for (final CategoryData categorydata : mainSearchPageData.getSubCategories())
		{
			final String midCategoryCode = categorydata.getCode();

			final ProductCategorySearchPageData<SearchStateData, ProductData, CategoryData> midSearchPageData = getProductSearchFacade()
					.categorySearch(midCategoryCode);
			categoryList.put(categorydata.getName(), midSearchPageData.getSubCategories());
		}

		model.addAttribute("midcategories", categoryList);

		populateModel(model, searchPageData, showMode);
		model.addAttribute(WebConstants.BREADCRUMBS_KEY,
				searchCategoryPageBreadcrumbBuilder.getBreadcrumbs(categoryCode, searchPageData));
		model.addAttribute("showCategoriesOnly", Boolean.valueOf(showCategoriesOnly));
		model.addAttribute("categoryName", category.getName());
		//model.addAttribute("pageType", PageType.Category);
		model.addAttribute("pageType", PageType.CATEGORY.name());
		model.addAttribute("userLocation", getCustomerLocationService().getUserLocation());

		updatePageTitle(category, searchPageData.getBreadcrumbs(), model);

		final RequestContextData requestContextData = getRequestContextData(request);
		requestContextData.setCategory(category);
		requestContextData.setSearch(searchPageData);

		if (searchQuery != null)
		{
			model.addAttribute("metaRobots", "noindex,follow");
		}

		final String metaKeywords = MetaSanitizerUtil.sanitizeKeywords(category.getKeywords());
		final String metaDescription = MetaSanitizerUtil.sanitizeDescription(category.getDescription());
		setUpMetaData(model, metaKeywords, metaDescription);

		return getViewForPage(model);
	}

}