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

package com.testritegroup.ec.core.category.strategies.impl;

import com.testritegroup.ec.core.category.strategies.ECPBrandProductFindStrategy;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kesler Wang <kesler.wang@sap.com>
 */
public class ECPHotSellProductFindStrategyMock extends ECPBrandProductFindStrategy
{


   public List<ProductModel> getBrandProductsByBrandCode( String brandCode )
   {

      if ( StringUtils.isNotEmpty( brandCode ) )
      {

         final FlexibleSearchQuery fQuery = new FlexibleSearchQuery( SQL );
         fQuery.addQueryParameter("code", brandCode);
         return getEcpBrandDao().getECPBrandProductsByQuery(fQuery);

      }

      return new ArrayList<ProductModel>(0);
   }
}