/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/10/14 上午 11:58:46                      ---
 * ----------------------------------------------------------------
 */
package com.testritegroup.ec.core.jalo;

import com.testritegroup.ec.core.constants.TestriteCoreConstants;
import com.testritegroup.ec.core.jalo.ApparelProduct;
import com.testritegroup.ec.core.jalo.ApparelSizeVariantProduct;
import com.testritegroup.ec.core.jalo.ApparelStyleVariantProduct;
import com.testritegroup.ec.core.jalo.ECPBackendCategory;
import com.testritegroup.ec.core.jalo.ECPBackendInformation;
import com.testritegroup.ec.core.jalo.ECPBrand;
import com.testritegroup.ec.core.jalo.ECPCategory;
import com.testritegroup.ec.core.jalo.ECPDimension;
import com.testritegroup.ec.core.jalo.ECPImage;
import com.testritegroup.ec.core.jalo.ECPSocialReviewArticle;
import com.testritegroup.ec.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.europe1.jalo.PDTRow;
import de.hybris.platform.europe1.jalo.PriceRow;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.ordersplitting.jalo.StockLevel;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>TestriteCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTestriteCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("backendInfo", AttributeMode.INITIAL);
		tmp.put("allowVendorDelivery", AttributeMode.INITIAL);
		tmp.put("allowIslandDelivery", AttributeMode.INITIAL);
		tmp.put("allowHomeDelivery", AttributeMode.INITIAL);
		tmp.put("allowStorePickup", AttributeMode.INITIAL);
		tmp.put("allowOnlineSell", AttributeMode.INITIAL);
		tmp.put("productDimension", AttributeMode.INITIAL);
		tmp.put("packageDimension", AttributeMode.INITIAL);
		tmp.put("weight", AttributeMode.INITIAL);
		tmp.put("countryOfOrigin", AttributeMode.INITIAL);
		tmp.put("material", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cost", AttributeMode.INITIAL);
		tmp.put("storePrice", AttributeMode.INITIAL);
		tmp.put("listPrice", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.europe1.jalo.PriceRow", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("preventUpdateFromBackendStartDate", AttributeMode.INITIAL);
		tmp.put("preventUpdateFromBackendEndDate", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.ordersplitting.jalo.StockLevel", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowHomeDelivery</code> attribute.
	 * @return the allowHomeDelivery - Enable delivery using courier
	 */
	public Boolean isAllowHomeDelivery(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.ALLOWHOMEDELIVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowHomeDelivery</code> attribute.
	 * @return the allowHomeDelivery - Enable delivery using courier
	 */
	public Boolean isAllowHomeDelivery(final Product item)
	{
		return isAllowHomeDelivery( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowHomeDelivery</code> attribute. 
	 * @return the allowHomeDelivery - Enable delivery using courier
	 */
	public boolean isAllowHomeDeliveryAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isAllowHomeDelivery( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowHomeDelivery</code> attribute. 
	 * @return the allowHomeDelivery - Enable delivery using courier
	 */
	public boolean isAllowHomeDeliveryAsPrimitive(final Product item)
	{
		return isAllowHomeDeliveryAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowHomeDelivery</code> attribute. 
	 * @param value the allowHomeDelivery - Enable delivery using courier
	 */
	public void setAllowHomeDelivery(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.ALLOWHOMEDELIVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowHomeDelivery</code> attribute. 
	 * @param value the allowHomeDelivery - Enable delivery using courier
	 */
	public void setAllowHomeDelivery(final Product item, final Boolean value)
	{
		setAllowHomeDelivery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowHomeDelivery</code> attribute. 
	 * @param value the allowHomeDelivery - Enable delivery using courier
	 */
	public void setAllowHomeDelivery(final SessionContext ctx, final Product item, final boolean value)
	{
		setAllowHomeDelivery( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowHomeDelivery</code> attribute. 
	 * @param value the allowHomeDelivery - Enable delivery using courier
	 */
	public void setAllowHomeDelivery(final Product item, final boolean value)
	{
		setAllowHomeDelivery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowIslandDelivery</code> attribute.
	 * @return the allowIslandDelivery - Enable delivery to suburb areas
	 */
	public Boolean isAllowIslandDelivery(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.ALLOWISLANDDELIVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowIslandDelivery</code> attribute.
	 * @return the allowIslandDelivery - Enable delivery to suburb areas
	 */
	public Boolean isAllowIslandDelivery(final Product item)
	{
		return isAllowIslandDelivery( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowIslandDelivery</code> attribute. 
	 * @return the allowIslandDelivery - Enable delivery to suburb areas
	 */
	public boolean isAllowIslandDeliveryAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isAllowIslandDelivery( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowIslandDelivery</code> attribute. 
	 * @return the allowIslandDelivery - Enable delivery to suburb areas
	 */
	public boolean isAllowIslandDeliveryAsPrimitive(final Product item)
	{
		return isAllowIslandDeliveryAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowIslandDelivery</code> attribute. 
	 * @param value the allowIslandDelivery - Enable delivery to suburb areas
	 */
	public void setAllowIslandDelivery(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.ALLOWISLANDDELIVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowIslandDelivery</code> attribute. 
	 * @param value the allowIslandDelivery - Enable delivery to suburb areas
	 */
	public void setAllowIslandDelivery(final Product item, final Boolean value)
	{
		setAllowIslandDelivery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowIslandDelivery</code> attribute. 
	 * @param value the allowIslandDelivery - Enable delivery to suburb areas
	 */
	public void setAllowIslandDelivery(final SessionContext ctx, final Product item, final boolean value)
	{
		setAllowIslandDelivery( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowIslandDelivery</code> attribute. 
	 * @param value the allowIslandDelivery - Enable delivery to suburb areas
	 */
	public void setAllowIslandDelivery(final Product item, final boolean value)
	{
		setAllowIslandDelivery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowOnlineSell</code> attribute.
	 * @return the allowOnlineSell - Forcing product available for online sales
	 */
	public Boolean isAllowOnlineSell(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.ALLOWONLINESELL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowOnlineSell</code> attribute.
	 * @return the allowOnlineSell - Forcing product available for online sales
	 */
	public Boolean isAllowOnlineSell(final Product item)
	{
		return isAllowOnlineSell( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowOnlineSell</code> attribute. 
	 * @return the allowOnlineSell - Forcing product available for online sales
	 */
	public boolean isAllowOnlineSellAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isAllowOnlineSell( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowOnlineSell</code> attribute. 
	 * @return the allowOnlineSell - Forcing product available for online sales
	 */
	public boolean isAllowOnlineSellAsPrimitive(final Product item)
	{
		return isAllowOnlineSellAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowOnlineSell</code> attribute. 
	 * @param value the allowOnlineSell - Forcing product available for online sales
	 */
	public void setAllowOnlineSell(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.ALLOWONLINESELL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowOnlineSell</code> attribute. 
	 * @param value the allowOnlineSell - Forcing product available for online sales
	 */
	public void setAllowOnlineSell(final Product item, final Boolean value)
	{
		setAllowOnlineSell( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowOnlineSell</code> attribute. 
	 * @param value the allowOnlineSell - Forcing product available for online sales
	 */
	public void setAllowOnlineSell(final SessionContext ctx, final Product item, final boolean value)
	{
		setAllowOnlineSell( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowOnlineSell</code> attribute. 
	 * @param value the allowOnlineSell - Forcing product available for online sales
	 */
	public void setAllowOnlineSell(final Product item, final boolean value)
	{
		setAllowOnlineSell( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowStorePickup</code> attribute.
	 * @return the allowStorePickup - Enable pickup in store option
	 */
	public Boolean isAllowStorePickup(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.ALLOWSTOREPICKUP);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowStorePickup</code> attribute.
	 * @return the allowStorePickup - Enable pickup in store option
	 */
	public Boolean isAllowStorePickup(final Product item)
	{
		return isAllowStorePickup( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowStorePickup</code> attribute. 
	 * @return the allowStorePickup - Enable pickup in store option
	 */
	public boolean isAllowStorePickupAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isAllowStorePickup( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowStorePickup</code> attribute. 
	 * @return the allowStorePickup - Enable pickup in store option
	 */
	public boolean isAllowStorePickupAsPrimitive(final Product item)
	{
		return isAllowStorePickupAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowStorePickup</code> attribute. 
	 * @param value the allowStorePickup - Enable pickup in store option
	 */
	public void setAllowStorePickup(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.ALLOWSTOREPICKUP,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowStorePickup</code> attribute. 
	 * @param value the allowStorePickup - Enable pickup in store option
	 */
	public void setAllowStorePickup(final Product item, final Boolean value)
	{
		setAllowStorePickup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowStorePickup</code> attribute. 
	 * @param value the allowStorePickup - Enable pickup in store option
	 */
	public void setAllowStorePickup(final SessionContext ctx, final Product item, final boolean value)
	{
		setAllowStorePickup( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowStorePickup</code> attribute. 
	 * @param value the allowStorePickup - Enable pickup in store option
	 */
	public void setAllowStorePickup(final Product item, final boolean value)
	{
		setAllowStorePickup( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowVendorDelivery</code> attribute.
	 * @return the allowVendorDelivery - Enable delivery directly from vendor/manufacturer
	 */
	public Boolean isAllowVendorDelivery(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.ALLOWVENDORDELIVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowVendorDelivery</code> attribute.
	 * @return the allowVendorDelivery - Enable delivery directly from vendor/manufacturer
	 */
	public Boolean isAllowVendorDelivery(final Product item)
	{
		return isAllowVendorDelivery( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowVendorDelivery</code> attribute. 
	 * @return the allowVendorDelivery - Enable delivery directly from vendor/manufacturer
	 */
	public boolean isAllowVendorDeliveryAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isAllowVendorDelivery( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.allowVendorDelivery</code> attribute. 
	 * @return the allowVendorDelivery - Enable delivery directly from vendor/manufacturer
	 */
	public boolean isAllowVendorDeliveryAsPrimitive(final Product item)
	{
		return isAllowVendorDeliveryAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowVendorDelivery</code> attribute. 
	 * @param value the allowVendorDelivery - Enable delivery directly from vendor/manufacturer
	 */
	public void setAllowVendorDelivery(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.ALLOWVENDORDELIVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowVendorDelivery</code> attribute. 
	 * @param value the allowVendorDelivery - Enable delivery directly from vendor/manufacturer
	 */
	public void setAllowVendorDelivery(final Product item, final Boolean value)
	{
		setAllowVendorDelivery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowVendorDelivery</code> attribute. 
	 * @param value the allowVendorDelivery - Enable delivery directly from vendor/manufacturer
	 */
	public void setAllowVendorDelivery(final SessionContext ctx, final Product item, final boolean value)
	{
		setAllowVendorDelivery( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.allowVendorDelivery</code> attribute. 
	 * @param value the allowVendorDelivery - Enable delivery directly from vendor/manufacturer
	 */
	public void setAllowVendorDelivery(final Product item, final boolean value)
	{
		setAllowVendorDelivery( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.backendInfo</code> attribute.
	 * @return the backendInfo - Contain backend (ERP) information that mostly read-only
	 */
	public ECPBackendInformation getBackendInfo(final SessionContext ctx, final Product item)
	{
		return (ECPBackendInformation)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.BACKENDINFO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.backendInfo</code> attribute.
	 * @return the backendInfo - Contain backend (ERP) information that mostly read-only
	 */
	public ECPBackendInformation getBackendInfo(final Product item)
	{
		return getBackendInfo( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.backendInfo</code> attribute. 
	 * @param value the backendInfo - Contain backend (ERP) information that mostly read-only
	 */
	public void setBackendInfo(final SessionContext ctx, final Product item, final ECPBackendInformation value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.BACKENDINFO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.backendInfo</code> attribute. 
	 * @param value the backendInfo - Contain backend (ERP) information that mostly read-only
	 */
	public void setBackendInfo(final Product item, final ECPBackendInformation value)
	{
		setBackendInfo( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.cost</code> attribute.
	 * @return the cost
	 */
	public Double getCost(final SessionContext ctx, final PriceRow item)
	{
		return (Double)item.getProperty( ctx, TestriteCoreConstants.Attributes.PriceRow.COST);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.cost</code> attribute.
	 * @return the cost
	 */
	public Double getCost(final PriceRow item)
	{
		return getCost( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.cost</code> attribute. 
	 * @return the cost
	 */
	public double getCostAsPrimitive(final SessionContext ctx, final PriceRow item)
	{
		Double value = getCost( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.cost</code> attribute. 
	 * @return the cost
	 */
	public double getCostAsPrimitive(final PriceRow item)
	{
		return getCostAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final SessionContext ctx, final PriceRow item, final Double value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.PriceRow.COST,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final PriceRow item, final Double value)
	{
		setCost( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final SessionContext ctx, final PriceRow item, final double value)
	{
		setCost( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.cost</code> attribute. 
	 * @param value the cost
	 */
	public void setCost(final PriceRow item, final double value)
	{
		setCost( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.countryOfOrigin</code> attribute.
	 * @return the countryOfOrigin
	 */
	public Country getCountryOfOrigin(final SessionContext ctx, final Product item)
	{
		return (Country)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.COUNTRYOFORIGIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.countryOfOrigin</code> attribute.
	 * @return the countryOfOrigin
	 */
	public Country getCountryOfOrigin(final Product item)
	{
		return getCountryOfOrigin( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.countryOfOrigin</code> attribute. 
	 * @param value the countryOfOrigin
	 */
	public void setCountryOfOrigin(final SessionContext ctx, final Product item, final Country value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.COUNTRYOFORIGIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.countryOfOrigin</code> attribute. 
	 * @param value the countryOfOrigin
	 */
	public void setCountryOfOrigin(final Product item, final Country value)
	{
		setCountryOfOrigin( getSession().getSessionContext(), item, value );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ECPBackendCategory createECPBackendCategory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.ECPBACKENDCATEGORY );
			return (ECPBackendCategory)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ECPBackendCategory : "+e.getMessage(), 0 );
		}
	}
	
	public ECPBackendCategory createECPBackendCategory(final Map attributeValues)
	{
		return createECPBackendCategory( getSession().getSessionContext(), attributeValues );
	}
	
	public ECPBackendInformation createECPBackendInformation(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.ECPBACKENDINFORMATION );
			return (ECPBackendInformation)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ECPBackendInformation : "+e.getMessage(), 0 );
		}
	}
	
	public ECPBackendInformation createECPBackendInformation(final Map attributeValues)
	{
		return createECPBackendInformation( getSession().getSessionContext(), attributeValues );
	}
	
	public ECPBrand createECPBrand(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.ECPBRAND );
			return (ECPBrand)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ECPBrand : "+e.getMessage(), 0 );
		}
	}
	
	public ECPBrand createECPBrand(final Map attributeValues)
	{
		return createECPBrand( getSession().getSessionContext(), attributeValues );
	}
	
	public ECPCategory createECPCategory(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.ECPCATEGORY );
			return (ECPCategory)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ECPCategory : "+e.getMessage(), 0 );
		}
	}
	
	public ECPCategory createECPCategory(final Map attributeValues)
	{
		return createECPCategory( getSession().getSessionContext(), attributeValues );
	}
	
	public ECPDimension createECPDimension(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.ECPDIMENSION );
			return (ECPDimension)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ECPDimension : "+e.getMessage(), 0 );
		}
	}
	
	public ECPDimension createECPDimension(final Map attributeValues)
	{
		return createECPDimension( getSession().getSessionContext(), attributeValues );
	}
	
	public ECPImage createECPImage(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.ECPIMAGE );
			return (ECPImage)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ECPImage : "+e.getMessage(), 0 );
		}
	}
	
	public ECPImage createECPImage(final Map attributeValues)
	{
		return createECPImage( getSession().getSessionContext(), attributeValues );
	}
	
	public ECPSocialReviewArticle createECPSocialReviewArticle(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.ECPSOCIALREVIEWARTICLE );
			return (ECPSocialReviewArticle)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ECPSocialReviewArticle : "+e.getMessage(), 0 );
		}
	}
	
	public ECPSocialReviewArticle createECPSocialReviewArticle(final Map attributeValues)
	{
		return createECPSocialReviewArticle( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TestriteCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TestriteCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.listPrice</code> attribute.
	 * @return the listPrice
	 */
	public Double getListPrice(final SessionContext ctx, final PriceRow item)
	{
		return (Double)item.getProperty( ctx, TestriteCoreConstants.Attributes.PriceRow.LISTPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.listPrice</code> attribute.
	 * @return the listPrice
	 */
	public Double getListPrice(final PriceRow item)
	{
		return getListPrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.listPrice</code> attribute. 
	 * @return the listPrice
	 */
	public double getListPriceAsPrimitive(final SessionContext ctx, final PriceRow item)
	{
		Double value = getListPrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.listPrice</code> attribute. 
	 * @return the listPrice
	 */
	public double getListPriceAsPrimitive(final PriceRow item)
	{
		return getListPriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.listPrice</code> attribute. 
	 * @param value the listPrice
	 */
	public void setListPrice(final SessionContext ctx, final PriceRow item, final Double value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.PriceRow.LISTPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.listPrice</code> attribute. 
	 * @param value the listPrice
	 */
	public void setListPrice(final PriceRow item, final Double value)
	{
		setListPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.listPrice</code> attribute. 
	 * @param value the listPrice
	 */
	public void setListPrice(final SessionContext ctx, final PriceRow item, final double value)
	{
		setListPrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.listPrice</code> attribute. 
	 * @param value the listPrice
	 */
	public void setListPrice(final PriceRow item, final double value)
	{
		setListPrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.material</code> attribute.
	 * @return the material
	 */
	public String getMaterial(final SessionContext ctx, final Product item)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.getMaterial requires a session language", 0 );
		}
		return (String)item.getLocalizedProperty( ctx, TestriteCoreConstants.Attributes.Product.MATERIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.material</code> attribute.
	 * @return the material
	 */
	public String getMaterial(final Product item)
	{
		return getMaterial( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.material</code> attribute. 
	 * @return the localized material
	 */
	public Map<Language,String> getAllMaterial(final SessionContext ctx, final Product item)
	{
		return (Map<Language,String>)item.getAllLocalizedProperties(ctx,TestriteCoreConstants.Attributes.Product.MATERIAL,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.material</code> attribute. 
	 * @return the localized material
	 */
	public Map<Language,String> getAllMaterial(final Product item)
	{
		return getAllMaterial( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.material</code> attribute. 
	 * @param value the material
	 */
	public void setMaterial(final SessionContext ctx, final Product item, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedProduct.setMaterial requires a session language", 0 );
		}
		item.setLocalizedProperty(ctx, TestriteCoreConstants.Attributes.Product.MATERIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.material</code> attribute. 
	 * @param value the material
	 */
	public void setMaterial(final Product item, final String value)
	{
		setMaterial( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.material</code> attribute. 
	 * @param value the material
	 */
	public void setAllMaterial(final SessionContext ctx, final Product item, final Map<Language,String> value)
	{
		item.setAllLocalizedProperties(ctx,TestriteCoreConstants.Attributes.Product.MATERIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.material</code> attribute. 
	 * @param value the material
	 */
	public void setAllMaterial(final Product item, final Map<Language,String> value)
	{
		setAllMaterial( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.packageDimension</code> attribute.
	 * @return the packageDimension
	 */
	public ECPDimension getPackageDimension(final SessionContext ctx, final Product item)
	{
		return (ECPDimension)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.PACKAGEDIMENSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.packageDimension</code> attribute.
	 * @return the packageDimension
	 */
	public ECPDimension getPackageDimension(final Product item)
	{
		return getPackageDimension( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.packageDimension</code> attribute. 
	 * @param value the packageDimension
	 */
	public void setPackageDimension(final SessionContext ctx, final Product item, final ECPDimension value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.PACKAGEDIMENSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.packageDimension</code> attribute. 
	 * @param value the packageDimension
	 */
	public void setPackageDimension(final Product item, final ECPDimension value)
	{
		setPackageDimension( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.preventUpdateFromBackendEndDate</code> attribute.
	 * @return the preventUpdateFromBackendEndDate
	 */
	public Date getPreventUpdateFromBackendEndDate(final SessionContext ctx, final StockLevel item)
	{
		return (Date)item.getProperty( ctx, TestriteCoreConstants.Attributes.StockLevel.PREVENTUPDATEFROMBACKENDENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.preventUpdateFromBackendEndDate</code> attribute.
	 * @return the preventUpdateFromBackendEndDate
	 */
	public Date getPreventUpdateFromBackendEndDate(final StockLevel item)
	{
		return getPreventUpdateFromBackendEndDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StockLevel.preventUpdateFromBackendEndDate</code> attribute. 
	 * @param value the preventUpdateFromBackendEndDate
	 */
	public void setPreventUpdateFromBackendEndDate(final SessionContext ctx, final StockLevel item, final Date value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.StockLevel.PREVENTUPDATEFROMBACKENDENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StockLevel.preventUpdateFromBackendEndDate</code> attribute. 
	 * @param value the preventUpdateFromBackendEndDate
	 */
	public void setPreventUpdateFromBackendEndDate(final StockLevel item, final Date value)
	{
		setPreventUpdateFromBackendEndDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.preventUpdateFromBackendStartDate</code> attribute.
	 * @return the preventUpdateFromBackendStartDate
	 */
	public Date getPreventUpdateFromBackendStartDate(final SessionContext ctx, final StockLevel item)
	{
		return (Date)item.getProperty( ctx, TestriteCoreConstants.Attributes.StockLevel.PREVENTUPDATEFROMBACKENDSTARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StockLevel.preventUpdateFromBackendStartDate</code> attribute.
	 * @return the preventUpdateFromBackendStartDate
	 */
	public Date getPreventUpdateFromBackendStartDate(final StockLevel item)
	{
		return getPreventUpdateFromBackendStartDate( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StockLevel.preventUpdateFromBackendStartDate</code> attribute. 
	 * @param value the preventUpdateFromBackendStartDate
	 */
	public void setPreventUpdateFromBackendStartDate(final SessionContext ctx, final StockLevel item, final Date value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.StockLevel.PREVENTUPDATEFROMBACKENDSTARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StockLevel.preventUpdateFromBackendStartDate</code> attribute. 
	 * @param value the preventUpdateFromBackendStartDate
	 */
	public void setPreventUpdateFromBackendStartDate(final StockLevel item, final Date value)
	{
		setPreventUpdateFromBackendStartDate( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productDimension</code> attribute.
	 * @return the productDimension
	 */
	public ECPDimension getProductDimension(final SessionContext ctx, final Product item)
	{
		return (ECPDimension)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.PRODUCTDIMENSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productDimension</code> attribute.
	 * @return the productDimension
	 */
	public ECPDimension getProductDimension(final Product item)
	{
		return getProductDimension( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productDimension</code> attribute. 
	 * @param value the productDimension
	 */
	public void setProductDimension(final SessionContext ctx, final Product item, final ECPDimension value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.PRODUCTDIMENSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productDimension</code> attribute. 
	 * @param value the productDimension
	 */
	public void setProductDimension(final Product item, final ECPDimension value)
	{
		setProductDimension( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.storePrice</code> attribute.
	 * @return the storePrice
	 */
	public Double getStorePrice(final SessionContext ctx, final PriceRow item)
	{
		return (Double)item.getProperty( ctx, TestriteCoreConstants.Attributes.PriceRow.STOREPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.storePrice</code> attribute.
	 * @return the storePrice
	 */
	public Double getStorePrice(final PriceRow item)
	{
		return getStorePrice( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.storePrice</code> attribute. 
	 * @return the storePrice
	 */
	public double getStorePriceAsPrimitive(final SessionContext ctx, final PriceRow item)
	{
		Double value = getStorePrice( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PriceRow.storePrice</code> attribute. 
	 * @return the storePrice
	 */
	public double getStorePriceAsPrimitive(final PriceRow item)
	{
		return getStorePriceAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.storePrice</code> attribute. 
	 * @param value the storePrice
	 */
	public void setStorePrice(final SessionContext ctx, final PriceRow item, final Double value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.PriceRow.STOREPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.storePrice</code> attribute. 
	 * @param value the storePrice
	 */
	public void setStorePrice(final PriceRow item, final Double value)
	{
		setStorePrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.storePrice</code> attribute. 
	 * @param value the storePrice
	 */
	public void setStorePrice(final SessionContext ctx, final PriceRow item, final double value)
	{
		setStorePrice( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PriceRow.storePrice</code> attribute. 
	 * @param value the storePrice
	 */
	public void setStorePrice(final PriceRow item, final double value)
	{
		setStorePrice( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute.
	 * @return the weight
	 */
	public Double getWeight(final SessionContext ctx, final Product item)
	{
		return (Double)item.getProperty( ctx, TestriteCoreConstants.Attributes.Product.WEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute.
	 * @return the weight
	 */
	public Double getWeight(final Product item)
	{
		return getWeight( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute. 
	 * @return the weight
	 */
	public double getWeightAsPrimitive(final SessionContext ctx, final Product item)
	{
		Double value = getWeight( ctx,item );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute. 
	 * @return the weight
	 */
	public double getWeightAsPrimitive(final Product item)
	{
		return getWeightAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final SessionContext ctx, final Product item, final Double value)
	{
		item.setProperty(ctx, TestriteCoreConstants.Attributes.Product.WEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final Product item, final Double value)
	{
		setWeight( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final SessionContext ctx, final Product item, final double value)
	{
		setWeight( ctx, item, Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight
	 */
	public void setWeight(final Product item, final double value)
	{
		setWeight( getSession().getSessionContext(), item, value );
	}
	
}
