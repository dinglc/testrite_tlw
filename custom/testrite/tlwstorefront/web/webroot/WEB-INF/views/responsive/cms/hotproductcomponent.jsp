<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>

<div class="hotItem">
	<div class="title-3">
		<h4 class="text-left">${title}</h4>
		<hr>
	</div>

<c:choose>
	<c:when test="${not empty productData}">

			<ul>
				<c:forEach items="${productData}" var="product" varStatus="Count" end="10">
					<li>
					<c:url value="${product.url}" var="productUrl"/>
					<a href="${productUrl}"><i>${Count.count}</i>
						<product:productPrimaryImage product="${product}" format="product"/>
					</a>
					<section>
					<h3>${product.name}</h3>
					<p><span class="orangeColor"><spring:theme code="product.volumePrices.column.specialprice"/></span>
					   <span class="orangeColor font_20"><format:fromPrice priceData="${product.price}"/></span>
					</p>
					</section>

					</li>
				</c:forEach>
    		</ul>

	</c:when>
	<c:otherwise>
		<component:emptyComponent/>
	</c:otherwise>
</c:choose>

</div>

