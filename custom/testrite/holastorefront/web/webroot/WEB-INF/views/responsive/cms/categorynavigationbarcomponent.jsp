<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<c:if test="${not empty root}">
	<ul class="nav nav-pills">
	<c:forEach items="${root}" var="r">
		<c:url value="${r.url}" var="rooturl"></c:url>
		<li role="presentation">
			<a href="${rooturl}">${r.name}</a>
		</li>
	</c:forEach>
	</ul>
</c:if>