/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/10/14 下午 04:13:03                      ---
 * ----------------------------------------------------------------
 */
package com.testritegroup.ec.core.jalo;

import com.testritegroup.ec.core.constants.TestriteCoreConstants;
import com.testritegroup.ec.core.jalo.ECPBackendCategory;
import com.testritegroup.ec.core.jalo.ECPImage;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.category.jalo.Category ECPCategory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedECPCategory extends Category
{
	/** Qualifier of the <code>ECPCategory.hotspot</code> attribute **/
	public static final String HOTSPOT = "hotspot";
	/** Qualifier of the <code>ECPCategory.backendCategories</code> attribute **/
	public static final String BACKENDCATEGORIES = "backendCategories";
	/** Relation ordering override parameter constants for ECPCategory2BackendCategory from ((testritecore))*/
	protected static String ECPCATEGORY2BACKENDCATEGORY_SRC_ORDERED = "relation.ECPCategory2BackendCategory.source.ordered";
	protected static String ECPCATEGORY2BACKENDCATEGORY_TGT_ORDERED = "relation.ECPCategory2BackendCategory.target.ordered";
	/** Relation disable markmodifed parameter constants for ECPCategory2BackendCategory from ((testritecore))*/
	protected static String ECPCATEGORY2BACKENDCATEGORY_MARKMODIFIED = "relation.ECPCategory2BackendCategory.markmodified";
	/** Qualifier of the <code>ECPCategory.advertisementBanners</code> attribute **/
	public static final String ADVERTISEMENTBANNERS = "advertisementBanners";
	/** Qualifier of the <code>ECPCategory.clearingSalesBanners</code> attribute **/
	public static final String CLEARINGSALESBANNERS = "clearingSalesBanners";
	/**
	* {@link OneToManyHandler} for handling 1:n ADVERTISEMENTBANNERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ECPImage> ADVERTISEMENTBANNERSHANDLER = new OneToManyHandler<ECPImage>(
	TestriteCoreConstants.TC.ECPIMAGE,
	false,
	"category",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CLEARINGSALESBANNERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ECPImage> CLEARINGSALESBANNERSHANDLER = new OneToManyHandler<ECPImage>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Category.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(HOTSPOT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.advertisementBanners</code> attribute.
	 * @return the advertisementBanners
	 */
	public Collection<ECPImage> getAdvertisementBanners(final SessionContext ctx)
	{
		return ADVERTISEMENTBANNERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.advertisementBanners</code> attribute.
	 * @return the advertisementBanners
	 */
	public Collection<ECPImage> getAdvertisementBanners()
	{
		return getAdvertisementBanners( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.advertisementBanners</code> attribute. 
	 * @param value the advertisementBanners
	 */
	public void setAdvertisementBanners(final SessionContext ctx, final Collection<ECPImage> value)
	{
		ADVERTISEMENTBANNERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.advertisementBanners</code> attribute. 
	 * @param value the advertisementBanners
	 */
	public void setAdvertisementBanners(final Collection<ECPImage> value)
	{
		setAdvertisementBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advertisementBanners. 
	 * @param value the item to add to advertisementBanners
	 */
	public void addToAdvertisementBanners(final SessionContext ctx, final ECPImage value)
	{
		ADVERTISEMENTBANNERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to advertisementBanners. 
	 * @param value the item to add to advertisementBanners
	 */
	public void addToAdvertisementBanners(final ECPImage value)
	{
		addToAdvertisementBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advertisementBanners. 
	 * @param value the item to remove from advertisementBanners
	 */
	public void removeFromAdvertisementBanners(final SessionContext ctx, final ECPImage value)
	{
		ADVERTISEMENTBANNERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from advertisementBanners. 
	 * @param value the item to remove from advertisementBanners
	 */
	public void removeFromAdvertisementBanners(final ECPImage value)
	{
		removeFromAdvertisementBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.backendCategories</code> attribute.
	 * @return the backendCategories
	 */
	public Collection<ECPBackendCategory> getBackendCategories(final SessionContext ctx)
	{
		final List<ECPBackendCategory> items = getLinkedItems( 
			ctx,
			true,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.backendCategories</code> attribute.
	 * @return the backendCategories
	 */
	public Collection<ECPBackendCategory> getBackendCategories()
	{
		return getBackendCategories( getSession().getSessionContext() );
	}
	
	public long getBackendCategoriesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null
		);
	}
	
	public long getBackendCategoriesCount()
	{
		return getBackendCategoriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.backendCategories</code> attribute. 
	 * @param value the backendCategories
	 */
	public void setBackendCategories(final SessionContext ctx, final Collection<ECPBackendCategory> value)
	{
		setLinkedItems( 
			ctx,
			true,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ECPCATEGORY2BACKENDCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.backendCategories</code> attribute. 
	 * @param value the backendCategories
	 */
	public void setBackendCategories(final Collection<ECPBackendCategory> value)
	{
		setBackendCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to backendCategories. 
	 * @param value the item to add to backendCategories
	 */
	public void addToBackendCategories(final SessionContext ctx, final ECPBackendCategory value)
	{
		addLinkedItems( 
			ctx,
			true,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ECPCATEGORY2BACKENDCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to backendCategories. 
	 * @param value the item to add to backendCategories
	 */
	public void addToBackendCategories(final ECPBackendCategory value)
	{
		addToBackendCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from backendCategories. 
	 * @param value the item to remove from backendCategories
	 */
	public void removeFromBackendCategories(final SessionContext ctx, final ECPBackendCategory value)
	{
		removeLinkedItems( 
			ctx,
			true,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ECPCATEGORY2BACKENDCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from backendCategories. 
	 * @param value the item to remove from backendCategories
	 */
	public void removeFromBackendCategories(final ECPBackendCategory value)
	{
		removeFromBackendCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.clearingSalesBanners</code> attribute.
	 * @return the clearingSalesBanners
	 */
	public Collection<ECPImage> getClearingSalesBanners(final SessionContext ctx)
	{
		return CLEARINGSALESBANNERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.clearingSalesBanners</code> attribute.
	 * @return the clearingSalesBanners
	 */
	public Collection<ECPImage> getClearingSalesBanners()
	{
		return getClearingSalesBanners( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.clearingSalesBanners</code> attribute. 
	 * @param value the clearingSalesBanners
	 */
	public void setClearingSalesBanners(final SessionContext ctx, final Collection<ECPImage> value)
	{
		CLEARINGSALESBANNERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.clearingSalesBanners</code> attribute. 
	 * @param value the clearingSalesBanners
	 */
	public void setClearingSalesBanners(final Collection<ECPImage> value)
	{
		setClearingSalesBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clearingSalesBanners. 
	 * @param value the item to add to clearingSalesBanners
	 */
	public void addToClearingSalesBanners(final SessionContext ctx, final ECPImage value)
	{
		CLEARINGSALESBANNERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clearingSalesBanners. 
	 * @param value the item to add to clearingSalesBanners
	 */
	public void addToClearingSalesBanners(final ECPImage value)
	{
		addToClearingSalesBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clearingSalesBanners. 
	 * @param value the item to remove from clearingSalesBanners
	 */
	public void removeFromClearingSalesBanners(final SessionContext ctx, final ECPImage value)
	{
		CLEARINGSALESBANNERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clearingSalesBanners. 
	 * @param value the item to remove from clearingSalesBanners
	 */
	public void removeFromClearingSalesBanners(final ECPImage value)
	{
		removeFromClearingSalesBanners( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.hotspot</code> attribute.
	 * @return the hotspot - Setting to determine if this category should be appeared as one of the hot selling subcats for it's parent category.
	 */
	public Boolean isHotspot(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, HOTSPOT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.hotspot</code> attribute.
	 * @return the hotspot - Setting to determine if this category should be appeared as one of the hot selling subcats for it's parent category.
	 */
	public Boolean isHotspot()
	{
		return isHotspot( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.hotspot</code> attribute. 
	 * @return the hotspot - Setting to determine if this category should be appeared as one of the hot selling subcats for it's parent category.
	 */
	public boolean isHotspotAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isHotspot( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPCategory.hotspot</code> attribute. 
	 * @return the hotspot - Setting to determine if this category should be appeared as one of the hot selling subcats for it's parent category.
	 */
	public boolean isHotspotAsPrimitive()
	{
		return isHotspotAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.hotspot</code> attribute. 
	 * @param value the hotspot - Setting to determine if this category should be appeared as one of the hot selling subcats for it's parent category.
	 */
	public void setHotspot(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, HOTSPOT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.hotspot</code> attribute. 
	 * @param value the hotspot - Setting to determine if this category should be appeared as one of the hot selling subcats for it's parent category.
	 */
	public void setHotspot(final Boolean value)
	{
		setHotspot( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.hotspot</code> attribute. 
	 * @param value the hotspot - Setting to determine if this category should be appeared as one of the hot selling subcats for it's parent category.
	 */
	public void setHotspot(final SessionContext ctx, final boolean value)
	{
		setHotspot( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPCategory.hotspot</code> attribute. 
	 * @param value the hotspot - Setting to determine if this category should be appeared as one of the hot selling subcats for it's parent category.
	 */
	public void setHotspot(final boolean value)
	{
		setHotspot( getSession().getSessionContext(), value );
	}
	
}
