<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="${not empty page ? page.label : urlLink}" var="encodedUrl" />
<!-- <div class="disp-img simple-banner"> -->
	<c:choose>
		<c:when test="${empty encodedUrl}">
			<div class="title">
				<h2>${headline}</h2>
			</div>
			<div class="thumb">
				<img title="${headline}" alt="${media.altText}" src="${media.url}" class="img-responsive">
			</div>
			<div class="details">
				<p>${content}</p>
			</div>
<!-- 			<div class="action"> -->
<%-- 				<theme:image code="img.iconArrowCategoryTile" alt="${media.altText}"/> --%>
<!-- 			</div> -->
		</c:when>
		<c:otherwise>
			<a href="${encodedUrl}">
				<c:if test="${not empty headline}">
					<strong>${headline}</strong>
				</c:if>
				
				<img title="${headline}" alt="${media.altText}" src="${media.url}" class="img-responsive">
			</a>	
			<c:if test="${not empty content}">
            	${content}
            </c:if>
<!-- 			<span class="action"> -->
<%-- 				<theme:image code="img.iconArrowCategoryTile" alt="${media.altText}"/> --%>
<!-- 			</span> -->
		</c:otherwise>
	</c:choose>
<!-- </div> -->