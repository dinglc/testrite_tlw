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
package com.testritegroup.ec.hola.facades.category;

import com.testritegroup.ec.hola.facades.category.data.ECPBrandData;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;

import java.util.List;

/**
 * Created by i318534 on 15/9/10.
 */
public interface ECPBrandFacade {

    public ECPBrandData findECPBrandByCode(String code);

    public List<ProductData> getBrandHotSellingProductByCode(String brandCode , List<ProductOption> productOptionList);

    public List<ProductData> getBrandNewArrivalProductByCode(String brandCode , List<ProductOption> productOptionList);
}
