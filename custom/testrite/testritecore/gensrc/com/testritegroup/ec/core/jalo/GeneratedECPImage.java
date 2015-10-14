/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/10/14 上午 11:58:46                      ---
 * ----------------------------------------------------------------
 */
package com.testritegroup.ec.core.jalo;

import com.testritegroup.ec.core.constants.TestriteCoreConstants;
import com.testritegroup.ec.core.jalo.ECPCategory;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ECPImage}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedECPImage extends GenericItem
{
	/** Qualifier of the <code>ECPImage.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>ECPImage.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/** Qualifier of the <code>ECPImage.sequence</code> attribute **/
	public static final String SEQUENCE = "sequence";
	/** Qualifier of the <code>ECPImage.image</code> attribute **/
	public static final String IMAGE = "image";
	/** Qualifier of the <code>ECPImage.onlineDate</code> attribute **/
	public static final String ONLINEDATE = "onlineDate";
	/** Qualifier of the <code>ECPImage.offlineDate</code> attribute **/
	public static final String OFFLINEDATE = "offlineDate";
	/** Qualifier of the <code>ECPImage.category</code> attribute **/
	public static final String CATEGORY = "category";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CATEGORY's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedECPImage> CATEGORYHANDLER = new BidirectionalOneToManyHandler<GeneratedECPImage>(
	TestriteCoreConstants.TC.ECPIMAGE,
	false,
	"category",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(CATALOGVERSION, AttributeMode.INITIAL);
		tmp.put(SEQUENCE, AttributeMode.INITIAL);
		tmp.put(IMAGE, AttributeMode.INITIAL);
		tmp.put(ONLINEDATE, AttributeMode.INITIAL);
		tmp.put(OFFLINEDATE, AttributeMode.INITIAL);
		tmp.put(CATEGORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion(final SessionContext ctx)
	{
		return (CatalogVersion)getProperty( ctx, CATALOGVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public CatalogVersion getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.catalogVersion</code> attribute. 
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
	 * <i>Generated method</i> - Setter of the <code>ECPImage.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	protected void setCatalogVersion(final CatalogVersion value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.category</code> attribute.
	 * @return the category
	 */
	public ECPCategory getCategory(final SessionContext ctx)
	{
		return (ECPCategory)getProperty( ctx, CATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.category</code> attribute.
	 * @return the category
	 */
	public ECPCategory getCategory()
	{
		return getCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final SessionContext ctx, final ECPCategory value)
	{
		CATEGORYHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.category</code> attribute. 
	 * @param value the category
	 */
	public void setCategory(final ECPCategory value)
	{
		setCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CATEGORYHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.image</code> attribute.
	 * @return the image
	 */
	public Media getImage(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPImage.getImage requires a session language", 0 );
		}
		return (Media)getLocalizedProperty( ctx, IMAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.image</code> attribute.
	 * @return the image
	 */
	public Media getImage()
	{
		return getImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.image</code> attribute. 
	 * @return the localized image
	 */
	public Map<Language,Media> getAllImage(final SessionContext ctx)
	{
		return (Map<Language,Media>)getAllLocalizedProperties(ctx,IMAGE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.image</code> attribute. 
	 * @return the localized image
	 */
	public Map<Language,Media> getAllImage()
	{
		return getAllImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.image</code> attribute. 
	 * @param value the image
	 */
	public void setImage(final SessionContext ctx, final Media value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPImage.setImage requires a session language", 0 );
		}
		setLocalizedProperty(ctx, IMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.image</code> attribute. 
	 * @param value the image
	 */
	public void setImage(final Media value)
	{
		setImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.image</code> attribute. 
	 * @param value the image
	 */
	public void setAllImage(final SessionContext ctx, final Map<Language,Media> value)
	{
		setAllLocalizedProperties(ctx,IMAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.image</code> attribute. 
	 * @param value the image
	 */
	public void setAllImage(final Map<Language,Media> value)
	{
		setAllImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.offlineDate</code> attribute.
	 * @return the offlineDate - Offline date that this banner is not effective and hid.
	 */
	public Date getOfflineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, OFFLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.offlineDate</code> attribute.
	 * @return the offlineDate - Offline date that this banner is not effective and hid.
	 */
	public Date getOfflineDate()
	{
		return getOfflineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.offlineDate</code> attribute. 
	 * @param value the offlineDate - Offline date that this banner is not effective and hid.
	 */
	public void setOfflineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, OFFLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.offlineDate</code> attribute. 
	 * @param value the offlineDate - Offline date that this banner is not effective and hid.
	 */
	public void setOfflineDate(final Date value)
	{
		setOfflineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.onlineDate</code> attribute.
	 * @return the onlineDate - Online date that this banner is effective and shown.
	 */
	public Date getOnlineDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ONLINEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.onlineDate</code> attribute.
	 * @return the onlineDate - Online date that this banner is effective and shown.
	 */
	public Date getOnlineDate()
	{
		return getOnlineDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.onlineDate</code> attribute. 
	 * @param value the onlineDate - Online date that this banner is effective and shown.
	 */
	public void setOnlineDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ONLINEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.onlineDate</code> attribute. 
	 * @param value the onlineDate - Online date that this banner is effective and shown.
	 */
	public void setOnlineDate(final Date value)
	{
		setOnlineDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.sequence</code> attribute.
	 * @return the sequence
	 */
	public Integer getSequence(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, SEQUENCE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.sequence</code> attribute.
	 * @return the sequence
	 */
	public Integer getSequence()
	{
		return getSequence( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.sequence</code> attribute. 
	 * @return the sequence
	 */
	public int getSequenceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getSequence( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPImage.sequence</code> attribute. 
	 * @return the sequence
	 */
	public int getSequenceAsPrimitive()
	{
		return getSequenceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.sequence</code> attribute. 
	 * @param value the sequence
	 */
	public void setSequence(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, SEQUENCE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.sequence</code> attribute. 
	 * @param value the sequence
	 */
	public void setSequence(final Integer value)
	{
		setSequence( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.sequence</code> attribute. 
	 * @param value the sequence
	 */
	public void setSequence(final SessionContext ctx, final int value)
	{
		setSequence( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPImage.sequence</code> attribute. 
	 * @param value the sequence
	 */
	public void setSequence(final int value)
	{
		setSequence( getSession().getSessionContext(), value );
	}
	
}
