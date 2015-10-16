/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2015/10/14 下午 04:13:03                      ---
 * ----------------------------------------------------------------
 */
package com.testritegroup.ec.core.jalo;

import com.testritegroup.ec.core.constants.TestriteCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem ECPSocialReviewArticle}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedECPSocialReviewArticle extends GenericItem
{
	/** Qualifier of the <code>ECPSocialReviewArticle.articleId</code> attribute **/
	public static final String ARTICLEID = "articleId";
	/** Qualifier of the <code>ECPSocialReviewArticle.title</code> attribute **/
	public static final String TITLE = "title";
	/** Qualifier of the <code>ECPSocialReviewArticle.summary</code> attribute **/
	public static final String SUMMARY = "summary";
	/** Qualifier of the <code>ECPSocialReviewArticle.authorId</code> attribute **/
	public static final String AUTHORID = "authorId";
	/** Qualifier of the <code>ECPSocialReviewArticle.authorName</code> attribute **/
	public static final String AUTHORNAME = "authorName";
	/** Qualifier of the <code>ECPSocialReviewArticle.publishDate</code> attribute **/
	public static final String PUBLISHDATE = "publishDate";
	/** Qualifier of the <code>ECPSocialReviewArticle.product</code> attribute **/
	public static final String PRODUCT = "product";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PRODUCT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedECPSocialReviewArticle> PRODUCTHANDLER = new BidirectionalOneToManyHandler<GeneratedECPSocialReviewArticle>(
	TestriteCoreConstants.TC.ECPSOCIALREVIEWARTICLE,
	false,
	"product",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ARTICLEID, AttributeMode.INITIAL);
		tmp.put(TITLE, AttributeMode.INITIAL);
		tmp.put(SUMMARY, AttributeMode.INITIAL);
		tmp.put(AUTHORID, AttributeMode.INITIAL);
		tmp.put(AUTHORNAME, AttributeMode.INITIAL);
		tmp.put(PUBLISHDATE, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.articleId</code> attribute.
	 * @return the articleId
	 */
	public String getArticleId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ARTICLEID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.articleId</code> attribute.
	 * @return the articleId
	 */
	public String getArticleId()
	{
		return getArticleId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.articleId</code> attribute. 
	 * @param value the articleId
	 */
	public void setArticleId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ARTICLEID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.articleId</code> attribute. 
	 * @param value the articleId
	 */
	public void setArticleId(final String value)
	{
		setArticleId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.authorId</code> attribute.
	 * @return the authorId
	 */
	public String getAuthorId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AUTHORID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.authorId</code> attribute.
	 * @return the authorId
	 */
	public String getAuthorId()
	{
		return getAuthorId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.authorId</code> attribute. 
	 * @param value the authorId
	 */
	public void setAuthorId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AUTHORID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.authorId</code> attribute. 
	 * @param value the authorId
	 */
	public void setAuthorId(final String value)
	{
		setAuthorId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.authorName</code> attribute.
	 * @return the authorName
	 */
	public String getAuthorName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPSocialReviewArticle.getAuthorName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, AUTHORNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.authorName</code> attribute.
	 * @return the authorName
	 */
	public String getAuthorName()
	{
		return getAuthorName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.authorName</code> attribute. 
	 * @return the localized authorName
	 */
	public Map<Language,String> getAllAuthorName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,AUTHORNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.authorName</code> attribute. 
	 * @return the localized authorName
	 */
	public Map<Language,String> getAllAuthorName()
	{
		return getAllAuthorName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.authorName</code> attribute. 
	 * @param value the authorName
	 */
	public void setAuthorName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPSocialReviewArticle.setAuthorName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, AUTHORNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.authorName</code> attribute. 
	 * @param value the authorName
	 */
	public void setAuthorName(final String value)
	{
		setAuthorName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.authorName</code> attribute. 
	 * @param value the authorName
	 */
	public void setAllAuthorName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,AUTHORNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.authorName</code> attribute. 
	 * @param value the authorName
	 */
	public void setAllAuthorName(final Map<Language,String> value)
	{
		setAllAuthorName( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PRODUCTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		PRODUCTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.publishDate</code> attribute.
	 * @return the publishDate
	 */
	public Date getPublishDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, PUBLISHDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.publishDate</code> attribute.
	 * @return the publishDate
	 */
	public Date getPublishDate()
	{
		return getPublishDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.publishDate</code> attribute. 
	 * @param value the publishDate
	 */
	public void setPublishDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, PUBLISHDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.publishDate</code> attribute. 
	 * @param value the publishDate
	 */
	public void setPublishDate(final Date value)
	{
		setPublishDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.summary</code> attribute.
	 * @return the summary
	 */
	public String getSummary(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPSocialReviewArticle.getSummary requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, SUMMARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.summary</code> attribute.
	 * @return the summary
	 */
	public String getSummary()
	{
		return getSummary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.summary</code> attribute. 
	 * @return the localized summary
	 */
	public Map<Language,String> getAllSummary(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,SUMMARY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.summary</code> attribute. 
	 * @return the localized summary
	 */
	public Map<Language,String> getAllSummary()
	{
		return getAllSummary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.summary</code> attribute. 
	 * @param value the summary
	 */
	public void setSummary(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPSocialReviewArticle.setSummary requires a session language", 0 );
		}
		setLocalizedProperty(ctx, SUMMARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.summary</code> attribute. 
	 * @param value the summary
	 */
	public void setSummary(final String value)
	{
		setSummary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.summary</code> attribute. 
	 * @param value the summary
	 */
	public void setAllSummary(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,SUMMARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.summary</code> attribute. 
	 * @param value the summary
	 */
	public void setAllSummary(final Map<Language,String> value)
	{
		setAllSummary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.title</code> attribute.
	 * @return the title
	 */
	public String getTitle(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPSocialReviewArticle.getTitle requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TITLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.title</code> attribute.
	 * @return the title
	 */
	public String getTitle()
	{
		return getTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.title</code> attribute. 
	 * @return the localized title
	 */
	public Map<Language,String> getAllTitle(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TITLE,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ECPSocialReviewArticle.title</code> attribute. 
	 * @return the localized title
	 */
	public Map<Language,String> getAllTitle()
	{
		return getAllTitle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedECPSocialReviewArticle.setTitle requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.title</code> attribute. 
	 * @param value the title
	 */
	public void setTitle(final String value)
	{
		setTitle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.title</code> attribute. 
	 * @param value the title
	 */
	public void setAllTitle(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TITLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ECPSocialReviewArticle.title</code> attribute. 
	 * @param value the title
	 */
	public void setAllTitle(final Map<Language,String> value)
	{
		setAllTitle( getSession().getSessionContext(), value );
	}
	
}
