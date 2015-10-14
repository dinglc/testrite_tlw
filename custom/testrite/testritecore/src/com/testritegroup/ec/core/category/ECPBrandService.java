/**
 * [y] hybris Platform
 * <p>
 * Copyright (c) 2000-2014 hybris AG
 * All rights reserved.
 * <p>
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 **/

package com.testritegroup.ec.core.category;

import com.testritegroup.ec.core.model.ECPBrandModel;

import java.util.List;

/**
 * Services for ECPBrand
 * @author Kesler Wang <kesler.wang@sap.com>
 */
public interface ECPBrandService
{
   public ECPBrandModel getECPBrandByCode(String brandCode);

   public List getHotSellProducts(String brandCode);

   public List getNewArrivalProducts(String brandCode);
}
