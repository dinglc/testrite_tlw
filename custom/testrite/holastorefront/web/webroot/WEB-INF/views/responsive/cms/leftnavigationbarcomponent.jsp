<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<c:set value="${component.styleClass} ${dropDownLayout}" var="bannerClasses"/>
<%-- <li class="${bannerClasses} <c:if test="${not empty component.navigationNode.children}"> has-sub js-enquire-has-sub</c:if>"> --%>
<!-- <li role="presentation"> -->
<%-- 	<cms:component component="${component.link}" evaluateRestriction="true"/> --%>
	<c:if test="${not empty component.navigationNode.children}">
<!-- 		<div class="sub-navigation"> -->
<!-- 			<div class="row"> -->
				<c:forEach items="${component.navigationNode.children}" var="child">
					<c:if test="${child.visible}">
					<c:forEach items="${child.children}" var="grandchild">
						<c:if test="${grandchild.visible}">
							<c:forEach items="${grandchild.children}" var="ggrandchild">
							
							<c:if test="${fn:containsIgnoreCase(ggrandchild.uid,mkcode)}">

								<c:set value="${fn:length(ggrandchild.links)/component.wrapAfter}" var="columns"/>
		
								<c:choose>
									<c:when test="${columns > 0 && columns <= 1}">
										<c:set value="col-md-4" var="sectionClass" />
									</c:when>
		
									<c:when test="${columns > 1 && columns < 3}">
										<c:set value="col-md-8" var="sectionClass" />
										<c:set value="column-2" var="columnClass" />
									</c:when>
		
									<c:when test="${columns > 2 && columns < 4}">
										<c:set value="col-md-12" var="sectionClass" />
										<c:set value="column-3" var="columnClass" />
									</c:when>
		
									<c:when test="${columns > 3 && columns < 5}">
										<c:set value="col-md-12" var="sectionClass" />
										<c:set value="column-4" var="columnClass" />
									</c:when>
									
									<c:otherwise>
										<c:set value="col-md-12" var="sectionClass" />
										<c:set value="column-5" var="columnClass" />
									</c:otherwise>
								</c:choose>
		
<%-- 								<div class="sub-navigation-section ${sectionClass}"> --%>
									<nav class="leftNav">
									<c:if test="${not empty ggrandchild.title}">
										<h3>${ggrandchild.title}</h3>
										<hr>
									</c:if>
									
<%-- 									<c:if test="${columns > 1}"> --%>
<!-- 										<div class="row"> -->
<%-- 									</c:if> --%>
									
										<c:forEach items="${ggrandchild.links}" step="${component.wrapAfter}" var="childlink" varStatus="i">
<%-- 											<c:if test="${columns > 1}"> --%>
<%-- 												<div class=" sub-navigation-section-column ${columnClass} "> --%>
<%-- 											</c:if> --%>
		
		
											<ul class="nav">
												<c:forEach items="${ggrandchild.links}" var="childlink" begin="${i.index}" end="${i.index + component.wrapAfter - 1}">
													<cms:component component="${childlink}" evaluateRestriction="true" element="li" />
												</c:forEach>
											</ul>
		
<%-- 											<c:if test="${columns > 1}"> --%>
<!-- 												</div> -->
<%-- 											</c:if> --%>
										</c:forEach>
<%-- 									<c:if test="${columns > 1}"> --%>
<!-- 										</div> -->
<%-- 									</c:if> --%>
									</nav>
<!-- 								</div> -->
							</c:if>
						</c:forEach>
						</c:if>
					</c:forEach>
					</c:if>
				</c:forEach>
<!-- 			</div> -->
<!-- 		</div> -->
	</c:if>
<!-- </li> -->