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

package com.testritegroup.ec.core.category.impl;

import com.testritegroup.ec.core.category.ECPBrandService;
import com.testritegroup.ec.core.category.dao.ECPBrandDao;
import com.testritegroup.ec.core.category.strategies.ECPBrandProductFindStrategy;
import com.testritegroup.ec.core.model.ECPBrandModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.internal.service.AbstractBusinessService;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateIfSingleResult;
import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNull;
import static java.lang.String.format;

/**
 * Default implementation for ECPBrand services
 *
 * @author Kesler Wang <kesler.wang@sap.com>
 */
public class ECPBrandServiceImpl extends AbstractBusinessService implements ECPBrandService
{
   private ECPBrandProductFindStrategy newArrivalProductFindStrategy;

   private ECPBrandProductFindStrategy hotSellProductFindStrategy;

   private ECPBrandDao brandDao;


   public ECPBrandModel getECPBrandByCode(String brandCode)
   {
      validateParameterNotNull(brandCode, "Parameter code must not be null");
      List<ECPBrandModel> brandModelList = brandDao.findECPBrandModelByCode(brandCode);

      validateIfSingleResult(brandModelList, format("ECPBrandModel with code '%s' not found!", brandCode),
              format("ECPBrandModel code '%s' is not unique, %d products found!", brandCode, Integer.valueOf(brandModelList.size())));

      return brandModelList.get(0);
   }


   @Override
   public List<ProductModel> getHotSellProducts(String brandCode)
   {
      validateParameterNotNull(brandCode, "Parameter code must not be null");
      List<ProductModel> list = hotSellProductFindStrategy.getBrandProductsByBrandCode(brandCode);
      return list;
   }

   @Override
   public List getNewArrivalProducts(String brandCode)
   {
      validateParameterNotNull(brandCode, "Parameter code must not be null");
      List<ProductModel> list = newArrivalProductFindStrategy.getBrandProductsByBrandCode(brandCode);
      return list;

   }


   public ECPBrandProductFindStrategy getHotSellProductFindStrategy()
   {
      return hotSellProductFindStrategy;
   }

   public void setHotSellProductFindStrategy(ECPBrandProductFindStrategy hotSellProductFindStrategy)
   {
      this.hotSellProductFindStrategy = hotSellProductFindStrategy;
   }

   public ECPBrandDao getBrandDao()
   {
      return brandDao;
   }

   @Required
   public void setBrandDao(ECPBrandDao brandDao)
   {
      this.brandDao = brandDao;
   }

   public ECPBrandProductFindStrategy getNewArrivalProductFindStrategy()
   {
      return newArrivalProductFindStrategy;
   }

   public void setNewArrivalProductFindStrategy(ECPBrandProductFindStrategy newArrivalProductFindStrategy)
   {
      this.newArrivalProductFindStrategy = newArrivalProductFindStrategy;
   }


}
