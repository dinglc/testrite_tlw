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

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.site.CMSSiteModel;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller for Shopping page
 */
@Controller
@Scope("tenant")
@RequestMapping("/shopping")
public class ShoppingPageController extends AbstractPageController
{
	private static final String SHOPPING_CMS_PAGE = "ShoppingPage";

	@Resource(name = "catalogVersionService")
	private CatalogVersionService catalogVersionService;

	@Resource(name = "categoryConverter")
	private Converter<CategoryModel, CategoryData> categoryConverter;

	@RequestMapping(method = RequestMethod.GET)
	public String showMk(final Model model, final HttpServletRequest request, final HttpServletResponse response)
			throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId(SHOPPING_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(SHOPPING_CMS_PAGE));
		for (final CatalogVersionModel catalogVersionModel : catalogVersionService.getSessionCatalogVersions())
		{
			try
			{
				final List<CategoryModel> root = catalogVersionModel.getRootCategories();
				if (root.size() > 0)
				{
					final Map<String, List<CategoryData>> categoryList = new HashMap<String, List<CategoryData>>();
					for (final CategoryModel categorymodel : root)
					{
						categoryList.put(categorymodel.getName(),
								Converters.convertAll(categorymodel.getAllSubcategories(), categoryConverter));
					}
					model.addAttribute("root", categoryList);
				}
			}
			catch (final UnknownIdentifierException ignore)
			{
				ignore.printStackTrace();
			}
		}
		updatePageTitle(model);

		return getViewForPage(model);
	}

	protected void updatePageTitle(final Model model)
	{
		final CMSSiteModel currentSite = getCmsSiteService().getCurrentSite();
		final StringBuffer mkCurrent = new StringBuffer();

		if (currentSite != null)
		{
			mkCurrent.append(currentSite.getName());
		}
		storeContentPageTitleInModel(model, StringEscapeUtils.escapeHtml(mkCurrent.toString()));
	}
}
