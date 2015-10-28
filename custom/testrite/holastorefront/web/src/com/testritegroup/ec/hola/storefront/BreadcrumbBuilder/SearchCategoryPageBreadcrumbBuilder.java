package com.testritegroup.ec.hola.storefront.BreadcrumbBuilder;

import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.Breadcrumb;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.impl.SearchBreadcrumbBuilder;
import de.hybris.platform.catalog.model.classification.ClassificationClassModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.cms2.servicelayer.services.CMSPageService;
import de.hybris.platform.commerceservices.url.UrlResolver;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.variants.model.VariantProductModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringEscapeUtils;


public class SearchCategoryPageBreadcrumbBuilder extends SearchBreadcrumbBuilder
{
	protected static final String LAST_LINK_CLASS = "active";

	@Resource(name = "cmsPageService")
	private CMSPageService cmsPageService;

	@Resource(name = "productModelUrlResolver")
	private UrlResolver<ProductModel> productModelUrlResolver;

	@Override
	public List<Breadcrumb> getBreadcrumbs(final String categoryCode, final String searchText, final boolean emptyBreadcrumbs)
			throws IllegalArgumentException
	{
		final List<Breadcrumb> breadcrumbs = new ArrayList<>();

		if (categoryCode == null)
		{
			final Breadcrumb breadcrumb = new Breadcrumb("/search?text=" + getEncodedUrl(searchText),
					StringEscapeUtils.escapeHtml(searchText), (emptyBreadcrumbs ? LAST_LINK_CLASS : ""));
			breadcrumbs.add(breadcrumb);
		}
		else
		{
			// Create category hierarchy path for breadcrumb

			final Collection<CategoryModel> categoryModels = new ArrayList<>();
			final CategoryModel lastCategoryModel = getCommerceCategoryService().getCategoryForCode(categoryCode);
			categoryModels.addAll(lastCategoryModel.getSupercategories());
			breadcrumbs.add(getCategoryBreadcrumb(lastCategoryModel, (!emptyBreadcrumbs ? LAST_LINK_CLASS : "")));
			Collections.reverse(getBreadcrumbs(breadcrumbs, categoryModels));
		}
		return breadcrumbs;

	}

	public List<Breadcrumb> getBreadcrumbs(final ProductModel productModel) throws IllegalArgumentException
	{
		final List<Breadcrumb> breadcrumbs = new ArrayList<>();

		final Collection<CategoryModel> categoryModels = new ArrayList<>();
		final Breadcrumb last;

		final ProductModel baseProductModel = getBaseProduct(productModel);
		last = getProductBreadcrumb(baseProductModel);
		categoryModels.addAll(baseProductModel.getSupercategories());
		last.setLinkClass(LAST_LINK_CLASS);

		breadcrumbs.add(last);
		final CategoryModel categoryModel = categoryModels.iterator().next();
		if (categoryModel != null)
		{
			breadcrumbs.add(getCategoryBreadcrumb(categoryModel));
			categoryModels.clear();
			categoryModels.addAll(categoryModel.getSupercategories());
		}
		Collections.reverse(getBreadcrumbs(breadcrumbs, categoryModels));
		return breadcrumbs;
	}

	public List<Breadcrumb> getBreadcrumbs(final List<Breadcrumb> breadcrumbs, final Collection<CategoryModel> categoryModels)
	{
		CategoryModel categoryModel = categoryModels.iterator().next();
		if (categoryModel != null && !categoryModel.getCode().equals("1"))
		{
			breadcrumbs.add(new Breadcrumb("", categoryModel.getName(), null));
			categoryModels.clear();
			categoryModels.addAll(categoryModel.getSupercategories());
		}

		while (!categoryModels.isEmpty())
		{
			categoryModel = categoryModels.iterator().next();

			if (!(categoryModel instanceof ClassificationClassModel))
			{
				if (categoryModel != null)
				{
					if (categoryModel.getCode().equals("1"))
					{
						try
						{
							final ContentPageModel pagemodel = cmsPageService.getPageForLabelOrId("ShoppingPage");
							breadcrumbs.add(new Breadcrumb("/shopping", pagemodel.getTitle(), null));
							categoryModels.clear();
							categoryModels.addAll(categoryModel.getSupercategories());
						}
						catch (final CMSItemNotFoundException e)
						{
							e.getMessage();
						}
					}
					else
					{
						breadcrumbs.add(getCategoryBreadcrumb(categoryModel));
						categoryModels.clear();
						categoryModels.addAll(categoryModel.getSupercategories());
					}
				}
			}
			else
			{
				categoryModels.remove(categoryModel);
			}
		}
		return breadcrumbs;
	}

	protected ProductModel getBaseProduct(final ProductModel product)
	{
		if (product instanceof VariantProductModel)
		{
			return getBaseProduct(((VariantProductModel) product).getBaseProduct());
		}
		return product;
	}

	protected Breadcrumb getProductBreadcrumb(final ProductModel product)
	{
		final String productUrl = productModelUrlResolver.resolve(product);
		return new Breadcrumb(productUrl, product.getName(), null);
	}
}
