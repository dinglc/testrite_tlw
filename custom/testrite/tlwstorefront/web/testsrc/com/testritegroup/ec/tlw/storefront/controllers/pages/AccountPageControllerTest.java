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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.acceleratorservices.storefront.util.PageTitleResolver;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.Breadcrumb;
import de.hybris.platform.acceleratorstorefrontcommons.breadcrumb.ResourceBreadcrumbBuilder;
import de.hybris.platform.acceleratorstorefrontcommons.forms.AddressForm;
import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.AddressValidator;
import de.hybris.platform.acceleratorstorefrontcommons.forms.verification.AddressVerificationResultHandler;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.cms2.model.pages.PageTemplateModel;
import de.hybris.platform.cms2.servicelayer.services.CMSPageService;
import de.hybris.platform.commercefacades.address.AddressVerificationFacade;
import de.hybris.platform.commercefacades.address.data.AddressVerificationResult;
import de.hybris.platform.commercefacades.customer.CustomerFacade;
import de.hybris.platform.commercefacades.i18n.I18NFacade;
import de.hybris.platform.commercefacades.order.CheckoutFacade;
import de.hybris.platform.commercefacades.user.UserFacade;
import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercefacades.user.data.CountryData;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commercefacades.user.data.TitleData;
import de.hybris.platform.commerceservices.address.AddressVerificationDecision;
import de.hybris.platform.servicelayer.i18n.I18NService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@UnitTest
public class AccountPageControllerTest
{
	private final Model page = Mockito.spy(new BindingAwareModelMap());

	private static final String VIEW_FOR_PAGE = "accountTest.jsp";
	private static final String VIEW_PREFIX = "pages/";
	private static final String TITLE_FOR_PAGE = "Account Test Title";
	public static final String CMS_PAGE_MODEL = "cmsPage";
	public static final String FIRST_NAME = "First";
	public static final String LAST_NAME = "Last";
	public static final String TITLE_CODE = "Mr.";
	public static final String TEST_ADDRESS_CODE = "12345";
	private static final String REDIRECT_TO_EDIT_ADDRESS_PAGE = "redirect:/my-account/edit-address/";
	private static final String REDIRECT_TO_ADDRESS_BOOK_PAGE = "redirect:/my-account/address-book";

	@InjectMocks
	private final AccountPageController accountController = Mockito.spy(new AccountPageController());

	@Mock
	private UserFacade userFacade;
	@Mock
	private CheckoutFacade checkoutFacade;
	@Mock
	private CustomerFacade customerFacade;
	@Mock
	private AddressVerificationFacade addressVerificationFacade;
	@Mock
	private I18NFacade i18NFacade;
	@Mock
	private I18NService i18nService;
	@Mock
	private ContentPageModel contentPageModel;
	@Mock
	private AddressData addressData;
	@Mock
	private CountryData countryData;
	@Mock
	private CustomerData customerData;
	@Mock
	private TitleData titleData;
	@Mock
	private ResourceBreadcrumbBuilder accountBreadcrumbBuilder;
	@Mock
	private Breadcrumb breadcrumb;
	@Mock
	private MessageSource messageSource;
	@Mock
	private CMSPageService cmsPageService;
	@Mock
	private PageTitleResolver pageTitleResolver;
	@Mock
	private PageTemplateModel pageTemplateModel;
	@Mock
	private AbstractPageModel abstractPageModel;
	@Mock
	private AddressForm addressForm;
	@Mock
	private BindingResult bindingResult;
	@Mock
	private RedirectAttributes redirectModel;
	@Mock
	private AddressValidator addressValidator;
	@Mock
	private AddressVerificationResultHandler addressVerificationResultHandler;

	@Before
	public void prepare() throws CMSItemNotFoundException
	{
		MockitoAnnotations.initMocks(this);

		final Locale locale = new Locale("en");
		final List breadcrumbsList = new ArrayList();
		breadcrumbsList.add(breadcrumb);


		BDDMockito.given(accountBreadcrumbBuilder.getBreadcrumbs(Mockito.anyString())).willReturn(breadcrumbsList);
		BDDMockito.given(cmsPageService.getPageForLabelOrId(Mockito.anyString())).willReturn(contentPageModel);
		BDDMockito.given(pageTitleResolver.resolveContentPageTitle(Mockito.anyString())).willReturn(TITLE_FOR_PAGE);
		BDDMockito.given(Boolean.valueOf(page.containsAttribute(CMS_PAGE_MODEL))).willReturn(Boolean.TRUE);
		BDDMockito.given(page.asMap().get(CMS_PAGE_MODEL)).willReturn(abstractPageModel);
		BDDMockito.given(abstractPageModel.getMasterTemplate()).willReturn(pageTemplateModel);
		BDDMockito.given(cmsPageService.getFrontendTemplateName(pageTemplateModel)).willReturn(VIEW_FOR_PAGE);

		BDDMockito.given(checkoutFacade.getDeliveryCountries()).willReturn(Collections.singletonList(countryData));
		BDDMockito.given(userFacade.getTitles()).willReturn(Collections.singletonList(titleData));

		BDDMockito.given(customerData.getFirstName()).willReturn(FIRST_NAME);
		BDDMockito.given(customerData.getLastName()).willReturn(LAST_NAME);
		BDDMockito.given(customerData.getTitleCode()).willReturn(TITLE_CODE);
		BDDMockito.given(customerFacade.getCurrentCustomer()).willReturn(customerData);
		BDDMockito.given(i18nService.getCurrentLocale()).willReturn(locale);
		BDDMockito.given(messageSource.getMessage(Mockito.anyString(), Mockito.any(Object[].class), Mockito.eq(locale)))
				.willReturn("ANY STRING");
		BDDMockito.given(i18NFacade.getCountryForIsocode(Mockito.anyString())).willReturn(countryData);
	}

	private void setupAddressCreateEdit()
	{
		BDDMockito.doReturn(addressForm).when(accountController).getPreparedAddressForm();
	}

	private void createBasicAddressFields()
	{
		BDDMockito.given(addressForm.getFirstName()).willReturn(FIRST_NAME);
		BDDMockito.given(addressForm.getLastName()).willReturn(LAST_NAME);
		BDDMockito.given(addressForm.getLine1()).willReturn("LINE 1");
		BDDMockito.given(addressForm.getCountryIso()).willReturn("US");
		BDDMockito.given(addressForm.getRegionIso()).willReturn("NY");
		BDDMockito.given(addressForm.getPostcode()).willReturn("12345");
	}

	@Test
	public void shouldGetAddressBook() throws CMSItemNotFoundException
	{
		BDDMockito.given(userFacade.getAddressBook()).willReturn(Collections.singletonList(addressData));

		final String addressBookPage = accountController.getAddressBook(page);
		Mockito.verify(page).addAttribute("addressData", Collections.singletonList(addressData));
		Mockito.verify(page).addAttribute("cmsPage", contentPageModel);
		Mockito.verify(page).addAttribute("pageTitle", TITLE_FOR_PAGE);

		assertEquals(VIEW_PREFIX + VIEW_FOR_PAGE, addressBookPage);
	}

	@Test
	public void shouldPrepareAddress()
	{
		final AddressForm addressForm = accountController.getPreparedAddressForm();
		assertEquals(FIRST_NAME, addressForm.getFirstName());
		assertEquals(LAST_NAME, addressForm.getLastName());
		assertEquals(TITLE_CODE, addressForm.getTitleCode());
	}

	@Test
	public void shouldGetAddAddress() throws CMSItemNotFoundException
	{
		setupAddressCreateEdit();
		final String addAddressPage = accountController.addAddress(page);

		Mockito.verify(page).addAttribute("countryData", Collections.singletonList(countryData));
		Mockito.verify(page).addAttribute("titleData", Collections.singletonList(titleData));
		Mockito.verify(page).addAttribute("addressForm", addressForm);
		Mockito.verify(page).addAttribute("addressBookEmpty", Boolean.FALSE);
		Mockito.verify(page).addAttribute("isDefaultAddress", Boolean.FALSE);

		assertEquals(VIEW_PREFIX + VIEW_FOR_PAGE, addAddressPage);
	}

	@Test
	public void shouldNotCreateInvalidAddress() throws CMSItemNotFoundException
	{
		BDDMockito.given(Boolean.valueOf(bindingResult.hasErrors())).willReturn(Boolean.TRUE);

		final String addAddressPage = accountController.addAddress(addressForm, bindingResult, page, redirectModel);

		Mockito.verify(accountController).setUpAddressFormAfterError(addressForm, page);
		assertEquals(VIEW_PREFIX + VIEW_FOR_PAGE, addAddressPage);
	}

	@Test
	public void shouldSuggestValidAddress() throws CMSItemNotFoundException
	{
		final AddressVerificationResult<AddressVerificationDecision> avsResult = new AddressVerificationResult<AddressVerificationDecision>();
		avsResult.setDecision(AddressVerificationDecision.REVIEW);
		createBasicAddressFields();
		BDDMockito.given(addressVerificationFacade.verifyAddressData(Mockito.any(AddressData.class))).willReturn(avsResult);
		BDDMockito.given(
				Boolean.valueOf(addressVerificationResultHandler.handleResult(Mockito.eq(avsResult), Mockito.any(AddressData.class),
						Mockito.eq(page), Mockito.eq(redirectModel), Mockito.eq(bindingResult), Mockito.anyBoolean(),
						Mockito.anyString()))).willReturn(Boolean.TRUE);

		final String addAddressPage = accountController.addAddress(addressForm, bindingResult, page, redirectModel);

		assertEquals(VIEW_PREFIX + VIEW_FOR_PAGE, addAddressPage);
	}

	@Test
	public void shouldCreateValidAddress() throws CMSItemNotFoundException
	{
		final AddressVerificationResult<AddressVerificationDecision> avsResult = new AddressVerificationResult<AddressVerificationDecision>();
		avsResult.setDecision(AddressVerificationDecision.ACCEPT);
		createBasicAddressFields();
		BDDMockito.given(addressVerificationFacade.verifyAddressData(Mockito.any(AddressData.class))).willReturn(avsResult);
		BDDMockito.given(
				Boolean.valueOf(addressVerificationResultHandler.handleResult(Mockito.eq(avsResult), Mockito.any(AddressData.class),
						Mockito.eq(page), Mockito.eq(redirectModel), Mockito.eq(bindingResult), Mockito.anyBoolean(),
						Mockito.anyString()))).willReturn(Boolean.FALSE);

		final String addAddressPage = accountController.addAddress(addressForm, bindingResult, page, redirectModel);

		Mockito.verify(userFacade).addAddress(Mockito.any(AddressData.class));
		assertThat(addAddressPage, CoreMatchers.containsString(REDIRECT_TO_EDIT_ADDRESS_PAGE));
	}

	@Test
	public void shouldGetEditAddress() throws CMSItemNotFoundException
	{
		final String addressBookPage = accountController.editAddress(TEST_ADDRESS_CODE, page);

		Mockito.verify(page).addAttribute("countryData", checkoutFacade.getDeliveryCountries());
		Mockito.verify(page).addAttribute("titleData", userFacade.getTitles());
		Mockito.verify(page).addAttribute("addressBookEmpty", Boolean.valueOf(userFacade.isAddressBookEmpty()));
		Mockito.verify(page).addAttribute("metaRobots", "noindex,nofollow");
		Mockito.verify(page).addAttribute("edit", Boolean.TRUE);
		assertEquals(VIEW_PREFIX + VIEW_FOR_PAGE, addressBookPage);
	}

	@Test
	public void shouldNotUpdateInvalidAddress() throws CMSItemNotFoundException
	{
		BDDMockito.given(Boolean.valueOf(bindingResult.hasErrors())).willReturn(Boolean.TRUE);

		final String addressBookPage = accountController.editAddress(addressForm, bindingResult, page, redirectModel);

		Mockito.verify(accountController).setUpAddressFormAfterError(addressForm, page);
		assertEquals(VIEW_PREFIX + VIEW_FOR_PAGE, addressBookPage);
	}

	@Test
	public void shouldSuggestValidUpdateAddress() throws CMSItemNotFoundException
	{
		final AddressVerificationResult<AddressVerificationDecision> avsResult = new AddressVerificationResult<AddressVerificationDecision>();
		avsResult.setDecision(AddressVerificationDecision.REVIEW);
		createBasicAddressFields();
		BDDMockito.given(addressVerificationFacade.verifyAddressData(Mockito.any(AddressData.class))).willReturn(avsResult);
		BDDMockito.given(
				Boolean.valueOf(addressVerificationResultHandler.handleResult(Mockito.eq(avsResult), Mockito.any(AddressData.class),
						Mockito.eq(page), Mockito.eq(redirectModel), Mockito.eq(bindingResult), Mockito.anyBoolean(),
						Mockito.anyString()))).willReturn(Boolean.TRUE);

		final String addAddressPage = accountController.editAddress(addressForm, bindingResult, page, redirectModel);

		assertEquals(VIEW_PREFIX + VIEW_FOR_PAGE, addAddressPage);
	}

	@Test
	public void shouldUpdateValidAddress() throws CMSItemNotFoundException
	{
		final String editAddressPage = accountController.editAddress(addressForm, bindingResult, page, redirectModel);

		Mockito.verify(userFacade).editAddress(Mockito.any(AddressData.class));
		assertThat(editAddressPage, CoreMatchers.containsString(REDIRECT_TO_EDIT_ADDRESS_PAGE));
	}

	@Test
	public void shouldSetDefaultAddress()
	{
		final String addressBookPage = accountController.setDefaultAddress(TEST_ADDRESS_CODE, redirectModel);

		Mockito.verify(userFacade).setDefaultAddress(Mockito.any(AddressData.class));
		assertEquals(REDIRECT_TO_ADDRESS_BOOK_PAGE, addressBookPage);
	}

	@Test
	public void shouldRemoveAddress()
	{
		final String addressBookPage = accountController.removeAddress(TEST_ADDRESS_CODE, redirectModel);

		Mockito.verify(userFacade).removeAddress(Mockito.any(AddressData.class));
		assertEquals(REDIRECT_TO_ADDRESS_BOOK_PAGE, addressBookPage);
	}
}
