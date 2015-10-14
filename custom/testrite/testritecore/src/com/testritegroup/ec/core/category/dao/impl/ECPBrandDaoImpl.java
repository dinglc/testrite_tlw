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

package com.testritegroup.ec.core.category.dao.impl;

import com.testritegroup.ec.core.category.dao.ECPBrandDao;
import com.testritegroup.ec.core.model.ECPBrandModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;

/**
 * Services for ECPBrand
 *
 * @author Kesler Wang <kesler.wang@sap.com>
 */
public class ECPBrandDaoImpl extends DefaultGenericDao<ECPBrandModel> implements ECPBrandDao
{
   public ECPBrandDaoImpl(final String typecode)
   {
      super(typecode);
   }

   @Override
   public List<ProductModel> getECPBrandProductsByQuery(FlexibleSearchQuery fQuery)
   {
      final SearchResult<ProductModel> result = getFlexibleSearchService().search(fQuery);

      List<ProductModel> resultList = result.getResult();
      if (CollectionUtils.isNotEmpty(resultList))
      {
         if (resultList.size() >= 5)
         {
            return resultList.subList(0, 5);
         } else
         {
            return resultList.subList(0, resultList.size());
         }
      }

      return new ArrayList<ProductModel>(0);
   }

   @Override
   public List<ECPBrandModel> findECPBrandModelByCode(String brandCode)
   {
      validateParameterNotNull(brandCode, "Product code must not be null!");
      return find(Collections.singletonMap(ECPBrandModel.CODE, (Object) brandCode));
   }

}
