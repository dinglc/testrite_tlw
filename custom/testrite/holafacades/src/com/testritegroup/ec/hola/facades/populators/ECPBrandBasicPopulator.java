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

package com.testritegroup.ec.hola.facades.populators;

import com.testritegroup.ec.core.model.ECPBrandModel;
import com.testritegroup.ec.hola.facades.category.data.ECPBrandData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

/**
 * Created by i318534 on 15/9/10.
 */
public class ECPBrandBasicPopulator <SOURCE extends ECPBrandModel, TARGET extends ECPBrandData> implements Populator<SOURCE, TARGET> {
    @Override
    public void populate(SOURCE brandModel, TARGET brandData) throws ConversionException {
        if(null != brandModel && null != brandData){
            brandData.setCode(brandModel.getCode());
            brandData.setName(brandModel.getName());
            brandData.setStory(brandModel.getStory());
        }

    }
}
