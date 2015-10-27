<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>

<c:choose>
	<c:when test="${not empty productData}">

			<div class="title-1 MT30"><h3>${title}</h3><section><hr></section></div>

			<c:choose>
				<c:when test="${component.popup}">
					<div class="row prdList">
						<c:forEach items="${productData}" var="product">
							<div class="col-sm-6 col-md-3">
                            <section>
								<a href="${productQuickViewUrl}">
									
								    <product:productPrimaryReferenceImage product="${product}" format="product"/>
								</a>	
									<h3>${product.name}</h3>
									<p><span class="redColor font_15"><spring:theme code="product.volumePrices.column.specialprice"/></span>
					                   <span class="redColor"><format:fromPrice priceData="${product.price}"/></span>
					                </p>
									
							</section>
							</div>
						</c:forEach>
					</div>
				</c:when>
				<c:otherwise>
					<div class="row prdList">
						<c:forEach items="${productData}" var="product">

							<c:url value="${product.url}" var="productUrl"/>

							<div class="col-sm-6 col-md-3">
								<section>
									<a href="${productUrl}">
										<product:productPrimaryImage product="${product}" format="product"/>
									</a>
									<h3>${product.name}</h3>
									<p><span class="redColor  font_15"><spring:theme code="product.volumePrices.column.specialprice"/></span>
					                   <span class="redColor"><format:fromPrice priceData="${product.price}"/></span>
					                </p>
									
								</section>
							</div>
						</c:forEach>
					</div>
				</c:otherwise>
			</c:choose>

	</c:when>

	<c:otherwise>
		<component:emptyComponent/>
	</c:otherwise>
</c:choose>

