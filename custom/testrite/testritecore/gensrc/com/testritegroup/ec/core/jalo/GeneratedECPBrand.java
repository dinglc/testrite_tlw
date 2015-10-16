/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/10/14 下午 04:13:03                      ---
 * ----------------------------------------------------------------
 */
package com.testritegroup.ec.core.jalo;

import com.testritegroup.ec.core.constants.TestriteCoreConstants;
import com.testritegroup.ec.core.jalo.ECPCategory;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.category.jalo.Category ECPBrand}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedECPBrand extends ECPCategory
{
	/** Qualifier of the <code>ECPBrand.story</code> attribute **/
	public static final String STORY = "story";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(ECPCategory.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STORY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
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
