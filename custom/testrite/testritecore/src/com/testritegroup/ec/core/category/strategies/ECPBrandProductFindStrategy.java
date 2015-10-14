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

package com.testritegroup.ec.core.category.strategies;

import com.testritegroup.ec.core.category.dao.ECPBrandDao;
import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

/**
 * @author Kesler Wang <kesler.wang@sap.com>
 */
public abstract class ECPBrandProductFindStrategy
{
   private ECPBrandDao ecpBrandDao;

   protected static final String SQL = "select {epc.PK} from {ECPBrand as epc} where epc:code=?code";

   abstract public List<ProductModel> getBrandProductsByBrandCode( String brandCode );


   public ECPBrandDao getEcpBrandDao()
   {
      return ecpBrandDao;
   }

   public void setEcpBrandDao(ECPBrandDao ecpBrandDao)
   {
      this.ecpBrandDao = ecpBrandDao;
   }

}


