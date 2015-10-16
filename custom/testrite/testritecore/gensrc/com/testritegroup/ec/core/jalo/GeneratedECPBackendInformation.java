/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/10/14 下午 04:13:03                      ---
 * ----------------------------------------------------------------
 */
package com.testritegroup.ec.core.jalo;

import com.testritegroup.ec.core.constants.TestriteCoreConstants;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ECPBackendInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedECPBackendInformation extends GenericItem
{
	/** Qualifier of the <code>ECPBackendInformation.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ECPBackendInformation.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/** Qualifier of the <code>ECPBackendInformation.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ECPBackendInformation.skuType</code> attribute **/
	public static final String SKUTYPE = "skuType";
	/** Qualifier of the <code>ECPBackendInformation.status</code> attribute **/
	public static final String STATUS = "status";
	/** Qualifier of the <code>ECPBackendInformation.reasonCode</code> attribute **/
	public static final String REASONCODE = "reasonCode";
	/** Qualifier of the <code>ECPBackendInformation.standardPackageType</code> attribute **/
	public static final String STANDARDPACKAGETYPE = "standardPackageType";
	/** Qualifier of the <code>ECPBackendInformation.negativeProfit</code> attribute **/
	public static final String NEGATIVEPROFIT = "negativeProfit";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(CATALOGVERSION, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(SKUTYPE, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		tmp.put(REASONCODE, AttributeMode.INITIAL);
		tmp.put(STANDARDPACKAGETYPE, AttributeMode.INITIAL);
		tmp.put(NEGATIVEPROFIT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	protected void setCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+CATALOGVERSION+"' is not changeable", 0 );
		}
		setProperty(ctx, CATALOGVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	protected void setCatalogVersion(final CatalogVersion value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPBackendInformation.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.name</code> attribute. 
	 * @return the localized name
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPBackendInformation.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.name</code> attribute. 
	 * @param value the name
	 */
	public void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.negativeProfit</code> attribute.
	 * @return the negativeProfit
	 */
	public Boolean isNegativeProfit(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, NEGATIVEPROFIT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.negativeProfit</code> attribute.
	 * @return the negativeProfit
	 */
	public Boolean isNegativeProfit()
	{
		return isNegativeProfit( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.negativeProfit</code> attribute. 
	 * @return the negativeProfit
	 */
	public boolean isNegativeProfitAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isNegativeProfit( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.negativeProfit</code> attribute. 
	 * @return the negativeProfit
	 */
	public boolean isNegativeProfitAsPrimitive()
	{
		return isNegativeProfitAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.negativeProfit</code> attribute. 
	 * @param value the negativeProfit
	 */
	public void setNegativeProfit(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, NEGATIVEPROFIT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.negativeProfit</code> attribute. 
	 * @param value the negativeProfit
	 */
	public void setNegativeProfit(final Boolean value)
	{
		setNegativeProfit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.negativeProfit</code> attribute. 
	 * @param value the negativeProfit
	 */
	public void setNegativeProfit(final SessionContext ctx, final boolean value)
	{
		setNegativeProfit( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.negativeProfit</code> attribute. 
	 * @param value the negativeProfit
	 */
	public void setNegativeProfit(final boolean value)
	{
		setNegativeProfit( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.reasonCode</code> attribute.
	 * @return the reasonCode
	 */
	public String getReasonCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASONCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.reasonCode</code> attribute.
	 * @return the reasonCode
	 */
	public String getReasonCode()
	{
		return getReasonCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.reasonCode</code> attribute. 
	 * @param value the reasonCode
	 */
	public void setReasonCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASONCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.reasonCode</code> attribute. 
	 * @param value the reasonCode
	 */
	public void setReasonCode(final String value)
	{
		setReasonCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.skuType</code> attribute.
	 * @return the skuType
	 */
	public String getSkuType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SKUTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.skuType</code> attribute.
	 * @return the skuType
	 */
	public String getSkuType()
	{
		return getSkuType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.skuType</code> attribute. 
	 * @param value the skuType
	 */
	public void setSkuType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SKUTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.skuType</code> attribute. 
	 * @param value the skuType
	 */
	public void setSkuType(final String value)
	{
		setSkuType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.standardPackageType</code> attribute.
	 * @return the standardPackageType
	 */
	public Integer getStandardPackageType(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, STANDARDPACKAGETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.standardPackageType</code> attribute.
	 * @return the standardPackageType
	 */
	public Integer getStandardPackageType()
	{
		return getStandardPackageType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.standardPackageType</code> attribute. 
	 * @return the standardPackageType
	 */
	public int getStandardPackageTypeAsPrimitive(final SessionContext ctx)
	{
		Integer value = getStandardPackageType( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.standardPackageType</code> attribute. 
	 * @return the standardPackageType
	 */
	public int getStandardPackageTypeAsPrimitive()
	{
		return getStandardPackageTypeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.standardPackageType</code> attribute. 
	 * @param value the standardPackageType
	 */
	public void setStandardPackageType(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, STANDARDPACKAGETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.standardPackageType</code> attribute. 
	 * @param value the standardPackageType
	 */
	public void setStandardPackageType(final Integer value)
	{
		setStandardPackageType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.standardPackageType</code> attribute. 
	 * @param value the standardPackageType
	 */
	public void setStandardPackageType(final SessionContext ctx, final int value)
	{
		setStandardPackageType( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.standardPackageType</code> attribute. 
	 * @param value the standardPackageType
	 */
	public void setStandardPackageType(final int value)
	{
		setStandardPackageType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendInformation.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendInformation.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
}
