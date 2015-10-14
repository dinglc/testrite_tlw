/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/10/14 上午 11:58:46                      ---
 * ----------------------------------------------------------------
 */
package com.testritegroup.ec.core.jalo;

import com.testritegroup.ec.core.constants.TestriteCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ECPBrand}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedECPBrand extends GenericItem
{
	/** Qualifier of the <code>ECPBrand.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ECPBrand.story</code> attribute **/
	public static final String STORY = "story";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(STORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBrand.name</code> attribute.
	 * @return the name - Name appears on the backend (ERP) system.
	 */
	public String getName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPBrand.getName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBrand.name</code> attribute.
	 * @return the name - Name appears on the backend (ERP) system.
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBrand.name</code> attribute. 
	 * @return the localized name - Name appears on the backend (ERP) system.
	 */
	public Map<Language,String> getAllName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,NAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBrand.name</code> attribute. 
	 * @return the localized name - Name appears on the backend (ERP) system.
	 */
	public Map<Language,String> getAllName()
	{
		return getAllName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBrand.name</code> attribute. 
	 * @param value the name - Name appears on the backend (ERP) system.
	 */
	protected void setName(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+NAME+"' is not changeable", 0 );
		}
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPBrand.setName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBrand.name</code> attribute. 
	 * @param value the name - Name appears on the backend (ERP) system.
	 */
	protected void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBrand.name</code> attribute. 
	 * @param value the name - Name appears on the backend (ERP) system.
	 */
	protected void setAllName(final SessionContext ctx, final Map<Language,String> value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+NAME+"' is not changeable", 0 );
		}
		setAllLocalizedProperties(ctx,NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBrand.name</code> attribute. 
	 * @param value the name - Name appears on the backend (ERP) system.
	 */
	protected void setAllName(final Map<Language,String> value)
	{
		setAllName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBrand.story</code> attribute.
	 * @return the story - Story for the brand
	 */
	public String getStory(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPBrand.getStory requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, STORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBrand.story</code> attribute.
	 * @return the story - Story for the brand
	 */
	public String getStory()
	{
		return getStory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBrand.story</code> attribute. 
	 * @return the localized story - Story for the brand
	 */
	public Map<Language,String> getAllStory(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,STORY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPBrand.story</code> attribute. 
	 * @return the localized story - Story for the brand
	 */
	public Map<Language,String> getAllStory()
	{
		return getAllStory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBrand.story</code> attribute. 
	 * @param value the story - Story for the brand
	 */
	protected void setStory(final SessionContext ctx, final String value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+STORY+"' is not changeable", 0 );
		}
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPBrand.setStory requires a session language", 0 );
		}
		setLocalizedProperty(ctx, STORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBrand.story</code> attribute. 
	 * @param value the story - Story for the brand
	 */
	protected void setStory(final String value)
	{
		setStory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBrand.story</code> attribute. 
	 * @param value the story - Story for the brand
	 */
	protected void setAllStory(final SessionContext ctx, final Map<Language,String> value)
	{
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+STORY+"' is not changeable", 0 );
		}
		setAllLocalizedProperties(ctx,STORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPBrand.story</code> attribute. 
	 * @param value the story - Story for the brand
	 */
	protected void setAllStory(final Map<Language,String> value)
	{
		setAllStory( getSession().getSessionContext(), value );
	}
	
}
