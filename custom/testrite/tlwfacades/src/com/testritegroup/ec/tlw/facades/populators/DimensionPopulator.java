/**
 *
 */
package com.testritegroup.ec.tlw.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.log4j.Logger;

import com.testritegroup.ec.core.model.ECPDimensionModel;
import com.testritegroup.ec.tlw.facades.product.data.DimensionData;


/**
 *
 */
public class DimensionPopulator<SOURCE extends ProductModel, TARGET extends ProductData> extends
		ProductBasicPopulator<SOURCE, TARGET>
{

	private static final Logger LOG = Logger.getLogger(DimensionPopulator.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator#populate(de.hybris.platform
	 * .core.model.product.ProductModel, de.hybris.platform.commercefacades.product.data.ProductData)
	 */
	@Override
	public void populate(final SOURCE productModel, final TARGET productData) throws ConversionException
	{
		final ECPDimensionModel dimensionModel = productModel.getProductDimension();
		final DimensionData dimensionData = new DimensionData();
		if (null != dimensionModel)
		{
			dimensionData.setHeight(dimensionModel.getHeight());
			dimensionData.setLength(dimensionModel.getLength());
			dimensionData.setWidth(dimensionModel.getWidth());
		}
		productData.setProductDimension(dimensionData);

	}
}
