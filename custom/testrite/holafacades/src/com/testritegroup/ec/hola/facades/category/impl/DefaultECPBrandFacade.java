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
package com.testritegroup.ec.hola.facades.category.impl;


import com.testritegroup.ec.core.category.ECPBrandService;
import com.testritegroup.ec.core.model.ECPBrandModel;
import com.testritegroup.ec.hola.facades.category.ECPBrandFacade;
import com.testritegroup.ec.hola.facades.category.data.ECPBrandData;
import de.hybris.platform.commercefacades.product.ProductFacade;
import de.hybris.platform.commercefacades.product.ProductOption;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i318534 on 15/9/10.
 */
public class DefaultECPBrandFacade implements ECPBrandFacade {

    private ECPBrandService ecpBrandService;

    private ProductFacade productFacade;

    private Populator<ECPBrandModel,ECPBrandData> brandBasicPopulator;

    @Override
    public ECPBrandData findECPBrandByCode(String code){
        ECPBrandModel brandModel= ecpBrandService.getECPBrandByCode(code);
        ECPBrandData brandData = new ECPBrandData();
        brandBasicPopulator.populate(brandModel,brandData);
        return brandData;

    }

    @Override
    public List<ProductData> getBrandHotSellingProductByCode(String brandCode,List<ProductOption> productOptionList) {

        List<ProductModel> resultList = ecpBrandService.getHotSellProducts(brandCode);
        return convertProductGetResult(resultList, productOptionList);

    }

    @Override
    public List<ProductData> getBrandNewArrivalProductByCode(String brandCode,List<ProductOption> productOptionList) {

        List<ProductModel> resultList = ecpBrandService.getNewArrivalProducts(brandCode);
        return convertProductGetResult(resultList, productOptionList);

    }


    private  List<ProductData> convertProductGetResult(List<ProductModel> resultList , List<ProductOption> productOptionList){
        if(CollectionUtils.isNotEmpty(resultList)) {
            if(CollectionUtils.isEmpty(productOptionList)){
                productOptionList = new ArrayList<ProductOption>(3);
                productOptionList.add(ProductOption.BASIC);
                productOptionList.add(ProductOption.PRICE);
                productOptionList.add(ProductOption.STOCK);

            }


            List<ProductData> displayList = new ArrayList<ProductData>(resultList.size());
            if (CollectionUtils.isNotEmpty(resultList)) {
                for (ProductModel productModel : resultList) {
                    final ProductData productData = productFacade.getProductForOptions(productModel, productOptionList);

                    displayList.add(productData);
                }
            }
            return displayList;
        }else{
            return new ArrayList<ProductData>(0);
        }
    }

    public ECPBrandService getEcpBrandService() {
        return ecpBrandService;
    }

    public Populator<ECPBrandModel, ECPBrandData> getBrandBasicPopulator() {
        return brandBasicPopulator;
    }

    public void setBrandBasicPopulator(Populator<ECPBrandModel, ECPBrandData> brandBasicPopulator) {
        this.brandBasicPopulator = brandBasicPopulator;
    }

    public void setEcpBrandService(ECPBrandService ecpBrandService) {
        this.ecpBrandService = ecpBrandService;
    }

    public ProductFacade getProductFacade() {
        return productFacade;
    }

    public void setProductFacade(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }
}
