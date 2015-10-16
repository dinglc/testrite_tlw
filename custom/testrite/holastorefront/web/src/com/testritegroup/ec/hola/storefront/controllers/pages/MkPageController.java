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
package com.testritegroup.ec.hola.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.site.CMSSiteModel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Controller for Mk page
 */
@Controller
@Scope("tenant")
@RequestMapping("/mk")
public class MkPageController extends AbstractPageController
{
	protected static final String MK_CODE_PATH_VARIABLE_PATTERN = "/{mkCode:.*}";
	protected static final String MK_SUBCODE_PATH_VARIABLE_PATTERN = "{mksubCode:.*}";
	private static final String MK_CMS_PAGE = "MkPage";

	@RequestMapping(value = MK_CODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String showMk(@PathVariable("mkCode") final String mkCode, final Model model, final HttpServletRequest request,
			final HttpServletResponse response) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId(MK_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(MK_CMS_PAGE));
		updatePageTitle(model, mkCode, null);
		//		updatePageTitle(model, getContentPageForLabelOrId(mkCode));
		model.addAttribute("mkcode", mkCode);
		//		model.addAttribute("mksubcode", "");

		return getViewForPage(model);
	}

	@RequestMapping(value = MK_CODE_PATH_VARIABLE_PATTERN + "/" + MK_SUBCODE_PATH_VARIABLE_PATTERN, method = RequestMethod.GET)
	public String showsubMk(@PathVariable("mkCode") final String mkCode, @PathVariable("mksubCode") final String mksubCode,
			final Model model, final HttpServletRequest request, final HttpServletResponse response) throws CMSItemNotFoundException
	{
		storeCmsPageInModel(model, getContentPageForLabelOrId(MK_CMS_PAGE));
		setUpMetaDataForContentPage(model, getContentPageForLabelOrId(MK_CMS_PAGE));
		updatePageTitle(model, mkCode, mksubCode);
		//		updatePageTitle(model, getContentPageForLabelOrId(mksubCode));
		model.addAttribute("mkcode", mkCode);
		model.addAttribute("mksubcode", mksubCode);

		return getViewForPage(model);
	}

	protected void updatePageTitle(final Model model, final String mkCode, final String mksubCode) throws CMSItemNotFoundException
	{
		final CMSSiteModel currentSite = getCmsSiteService().getCurrentSite();
		final StringBuffer mkCurrent = new StringBuffer();
		if (mksubCode != null && !mksubCode.isEmpty())
		{
			mkCurrent.append(getContentPageForLabelOrId(mksubCode).getTitle() + "|");
		}
		mkCurrent.append(getContentPageForLabelOrId(mkCode).getTitle() + "|");
		if (currentSite != null)
		{
			mkCurrent.append(currentSite.getName());
		}
		storeContentPageTitleInModel(model, StringEscapeUtils.escapeHtml(mkCurrent.toString()));
	}
	//	protected void updatePageTitle(final Model model, final AbstractPageModel cmsPage)
	//	{
	//		storeContentPageTitleInModel(model, getPageTitleResolver().resolveContentPageTitle(cmsPage.getTitle()));
	//	}
}
