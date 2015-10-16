<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="mkcode" required="true" type="java.lang.String"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ attribute name="component" required="false" type="de.hybris.platform.cms2.model.contents.components.AbstractCMSComponentModel"%>

<c:url value="/" var="homeUrl" />

<ol class="breadcrumb">
	<li>
		<a href="${homeUrl}"><spring:theme code="breadcrumb.home" /></a>
	</li>

	<c:if test="${not empty component.navigationNode.children}">
		<c:forEach items="${component.navigationNode.children}" var="child">
			<c:if test="${child.visible}">
				<c:forEach items="${child.children}" var="grandchild">
					<c:if test="${grandchild.visible}">
						<c:forEach items="${grandchild.children}" var="ggrandchild">
						
							<c:if test="${fn:containsIgnoreCase(ggrandchild.uid,mkcode)}">
								<c:forEach items="${ggrandchild.entries}" var="childentry">
										<li>
											<c:url value="${childentry.item.url}" var="url" />
											<c:choose>
												<c:when test="${not empty mksubcode}">
													<a href="${url}">${ggrandchild.title}</a>
												</c:when>
												<c:otherwise>
													${ggrandchild.title}
												</c:otherwise>
											</c:choose>
										</li>
								</c:forEach>
								
								<c:if test="${not empty mksubcode}">
								<c:forEach items="${ggrandchild.links}" var="childlink">
									<c:if test="${fn:containsIgnoreCase(childlink.uid,mksubcode)}">
										<li>
											${childlink.linkName}
										</li>
									</c:if>
								</c:forEach>
								</c:if>
							
							</c:if>
						</c:forEach>
					</c:if>
				</c:forEach>
			</c:if>
		</c:forEach>
	</c:if>	
								
</ol>
