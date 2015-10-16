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
package com.testritegroup.ec.hola.storefront.controllers.cms;

import de.hybris.platform.acceleratorcms.enums.NavigationBarMenuLayout;
import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.category.model.CategoryModel;
import de.hybris.platform.commercefacades.product.data.CategoryData;
import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testritegroup.ec.core.model.cms2.components.CategoryNavigationBarComponentModel;
import com.testritegroup.ec.hola.storefront.controllers.ControllerConstants;


/**
 *
 */
@Controller("CategoryNavigationBarComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.CategoryNavigationBarComponent)
public class CategoryNavigationBarComponentController extends AbstractCMSComponentController<CategoryNavigationBarComponentModel>
{
	private static final Logger LOG = Logger.getLogger(CategoryNavigationBarComponentController.class);

	@Resource(name = "catalogVersionService")
	private CatalogVersionService catalogVersionService;

	@Resource(name = "categoryConverter")
	private Converter<CategoryModel, CategoryData> categoryConverter;

	@Override
	protected void fillModel(final HttpServletRequest request, final Model model,
			final CategoryNavigationBarComponentModel component)
	{
		for (final CatalogVersionModel catalogVersionModel : catalogVersionService.getSessionCatalogVersions())
		{
			try
			{
				final List<CategoryModel> root = catalogVersionModel.getRootCategories();
				if (root.size() > 0)
				{
					model.addAttribute("root", Converters.convertAll(catalogVersionModel.getRootCategories(), categoryConverter));
				}
			}
			catch (final UnknownIdentifierException ignore)
			{
				ignore.printStackTrace();
			}
		}

		if (component.getDropDownLayout() != null)
		{
			model.addAttribute("dropDownLayout", component.getDropDownLayout().getCode().toLowerCase());
		}
		else if (component.getNavigationNode() != null && component.getNavigationNode().getChildren() != null
				&& !component.getNavigationNode().getChildren().isEmpty())
		{
			// Component has children but not drop down layout, default to auto
			model.addAttribute("dropDownLayout", NavigationBarMenuLayout.AUTO.getCode().toLowerCase());
		}
	}

}
