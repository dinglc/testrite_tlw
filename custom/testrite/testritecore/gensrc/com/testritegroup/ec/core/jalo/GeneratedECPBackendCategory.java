/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/10/14 下午 04:13:03                      ---
 * ----------------------------------------------------------------
 */
package com.testritegroup.ec.core.jalo;

import com.testritegroup.ec.core.constants.TestriteCoreConstants;
import com.testritegroup.ec.core.jalo.ECPCategory;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ECPBackendCategory}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedECPBackendCategory extends GenericItem
{
	/** Qualifier of the <code>ECPBackendCategory.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ECPBackendCategory.ecpCategories</code> attribute **/
	public static final String ECPCATEGORIES = "ecpCategories";
	/** Relation ordering override parameter constants for ECPCategory2BackendCategory from ((testritecore))*/
	protected static String ECPCATEGORY2BACKENDCATEGORY_SRC_ORDERED = "relation.ECPCategory2BackendCategory.source.ordered";
	protected static String ECPCATEGORY2BACKENDCATEGORY_TGT_ORDERED = "relation.ECPCategory2BackendCategory.target.ordered";
	/** Relation disable markmodifed parameter constants for ECPCategory2BackendCategory from ((testritecore))*/
	protected static String ECPCATEGORY2BACKENDCATEGORY_MARKMODIFIED = "relation.ECPCategory2BackendCategory.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendCategory.ecpCategories</code> attribute.
	 * @return the ecpCategories
	 */
	public Collection<ECPCategory> getEcpCategories(final SessionContext ctx)
	{
		final List<ECPCategory> items = getLinkedItems( 
			ctx,
			false,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendCategory.ecpCategories</code> attribute.
	 * @return the ecpCategories
	 */
	public Collection<ECPCategory> getEcpCategories()
	{
		return getEcpCategories( getSession().getSessionContext() );
	}
	
	public long getEcpCategoriesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null
		);
	}
	
	public long getEcpCategoriesCount()
	{
		return getEcpCategoriesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendCategory.ecpCategories</code> attribute. 
	 * @param value the ecpCategories
	 */
	public void setEcpCategories(final SessionContext ctx, final Collection<ECPCategory> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ECPCATEGORY2BACKENDCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendCategory.ecpCategories</code> attribute. 
	 * @param value the ecpCategories
	 */
	public void setEcpCategories(final Collection<ECPCategory> value)
	{
		setEcpCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ecpCategories. 
	 * @param value the item to add to ecpCategories
	 */
	public void addToEcpCategories(final SessionContext ctx, final ECPCategory value)
	{
		addLinkedItems( 
			ctx,
			false,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ECPCATEGORY2BACKENDCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ecpCategories. 
	 * @param value the item to add to ecpCategories
	 */
	public void addToEcpCategories(final ECPCategory value)
	{
		addToEcpCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ecpCategories. 
	 * @param value the item to remove from ecpCategories
	 */
	public void removeFromEcpCategories(final SessionContext ctx, final ECPCategory value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TestriteCoreConstants.Relations.ECPCATEGORY2BACKENDCATEGORY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ECPCATEGORY2BACKENDCATEGORY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ecpCategories. 
	 * @param value the item to remove from ecpCategories
	 */
	public void removeFromEcpCategories(final ECPCategory value)
	{
		removeFromEcpCategories( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendCategory.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBackendCategory.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendCategory.name</code> attribute. 
	 * @param value the name
	 */
	protected void setName(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+NAME+"' is not changeable", 0 );
		}
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBackendCategory.name</code> attribute. 
	 * @param value the name
	 */
	protected void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
