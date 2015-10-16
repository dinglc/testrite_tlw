<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="footer" tagdir="/WEB-INF/tags/responsive/common/footer"  %>

<div class="container">
	<div id="footerFN"> 
	<div class="row">
		<div class="col-xs-12 col-sm-3 col-md-5">
			<div class="safe_icons">
				<c:forEach items="${navigationNodes}" var="node">
					<c:if test="${node.visible}">
						<c:if test="${fn:contains(node.name,'Left')}">
							<c:forEach items="${node.links}" var="link">
								<c:forEach items="${node.entries}" var="entry">
									<c:if test="${fn:contains(link.name,entry.item.altText)}">
										<a href="${link.url}">
											<img src="${entry.item.url}"/>
										</a>
									</c:if>
								</c:forEach>
							</c:forEach>
						</c:if>
					</c:if>
				</c:forEach>
			</div>
		</div>
		<div class="col-xs-12 col-sm-9 col-md-7">
			<div class="row">
		       <c:forEach items="${navigationNodes}" var="node">
					<c:if test="${node.visible}">
						<c:if test="${fn:contains(node.name,'HolaFooter')}">
							<c:forEach items="${node.links}" var="link" varStatus="i">
								<c:choose>
									<c:when test="${i.index % 4 == 0}">
									 	<div class=" borderGrayR col-sm-4 col-xs-6">
             								<ul>
             									<cms:component component="${link}" evaluateRestriction="true" element="li" />
									</c:when>
									<c:when test="${i.index % 4 == 3 || i.last}">
												<cms:component component="${link}" evaluateRestriction="true" element="li" />
									 		</ul>
									 	</div>
									</c:when>
									<c:otherwise>
										<cms:component component="${link}" evaluateRestriction="true" element="li" />
									</c:otherwise>
								</c:choose>
							</c:forEach>
						</c:if>
					</c:if>
				</c:forEach>
	        
		        <div class="col-sm-4 col-xs-12">
			        <div class="co_icons">
				     	<div id="fb-root"></div>
					    <script>(function(d, s, id) {
					      var js, fjs = d.getElementsByTagName(s)[0];
					      if (d.getElementById(id)) return;
					      js = d.createElement(s); js.id = id;
					      js.src = "//connect.facebook.net/zh_TW/sdk.js#xfbml=1&version=v2.4&appId=199817436730919";
					      fjs.parentNode.insertBefore(js, fjs);
					    }(document, 'script', 'facebook-jssdk'));</script>
				       
				    	<div class="fb-like" data-layout="button_count" data-href="https://www.facebook.com/HOLA.taiwan"></div>
				    	<c:forEach items="${navigationNodes}" var="node">
				    		<c:if test="${node.visible}">
				    			<c:if test="${fn:contains(node.name,'Right')}">
					    			<c:forEach items="${node.links}" var="link" varStatus="i">
					    				<c:choose>
						    				<c:when test="${i.index % 4 == 0 }">
												<c:forEach items="${node.entries}" var="entry">
													<c:if test="${fn:contains(link.name,entry.item.altText)}">
														<section>
															<a href="${link.url}"><img src="${entry.item.url}"/></a>
													</c:if>
												</c:forEach>
											</c:when>
											<c:when test="${i.index % 4 == 3 || i.last}">
												<c:forEach items="${node.entries}" var="entry">
													<c:if test="${fn:contains(link.name,entry.item.altText)}">
															<a href="${link.url}"><img src="${entry.item.url}"/></a>
														</section>
														<c:if test="${!i.last}">
														<hr>
														</c:if>
													</c:if>
												</c:forEach>
											</c:when>
											<c:otherwise>
												<c:forEach items="${node.entries}" var="entry">
													<c:if test="${fn:contains(link.name,entry.item.altText)}">
														<a href="${link.url}"><img src="${entry.item.url}"/></a>
													</c:if>
												</c:forEach>
											</c:otherwise>
										</c:choose>
									</c:forEach>
				    			</c:if>
				    		</c:if>
				    	</c:forEach>
			    	</div>
		        </div>
	    	</div>
		</div>
	</div>
</div>

<footer class="text-center">
	<div class="container">
		<p>
			${notice}
		</p>	
	</div>
</footer>