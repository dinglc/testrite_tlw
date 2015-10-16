<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:if test="${component.visible}">

	<c:choose>
		<c:when test="${fn:containsIgnoreCase(component.name,'main') }">
			<ul class="nav nav-pills">
				<%--<li class="hidden-md hidden-lg">
					<a class="sm-back js-toggle-sm-navigation" href="#">Back</a>
				</li>--%>
				<c:forEach items="${components}" var="component">
<%-- 					<c:if test="${component.navigationNode.visible}"> --%>
					<cms:component component="${component}" evaluateRestriction="true" navigationType="offcanvas" />
<%-- 					</c:if> --%>
				</c:forEach>
			</ul>
		</c:when>
		<c:otherwise>
			<c:forEach items="${components}" var="component">
				<c:if test="${component.navigationNode.visible}">
				<div class="btn-group" role="group">
                    <button type="button" class="btn  dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    	${component.navigationNode.title}
                      <span class="caret"></span>
                    </button>
					<cms:component component="${component}" evaluateRestriction="true" navigationType="offcanvas" />
				</div>
				</c:if>
			</c:forEach>
		</c:otherwise>
	</c:choose>
</c:if>