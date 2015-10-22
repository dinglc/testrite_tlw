<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:url value="${urlLink}" var="encodedUrl" />

<div class="simple-banner-component">
	<c:choose>
		<c:when test="${empty media}">
			 <img src="${themeResourcePath}/images/missing_ad_215x90.jpg">
		</c:when>
		<c:otherwise>
			<c:choose>
				<c:when test="${empty encodedUrl || encodedUrl eq '#'}">
					<img title="${media.altText}" alt="${media.altText}"
						src="${media.url}">
				</c:when>
				<c:otherwise>
					<a href="${encodedUrl}"><img title="${media.altText}"
						alt="${media.altText}" src="${media.url}"></a>
				</c:otherwise>
			</c:choose>
		</c:otherwise>
	</c:choose>
</div>