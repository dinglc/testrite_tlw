<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>

<c:choose>
	<c:when test="${not empty productData}">
		<c:choose>
			<c:when test="${component.size == 4}">
				<div class="title-1 MT30">
					<h3>${title}</h3><section><hr></section>
				</div>
			</c:when>
			<c:when test="${component.size == 5}">
				<div class="title-2">
					<h3 class="letter_3px">${title}</h3><hr>
				</div>
			</c:when>
			<c:otherwise>
				<div class="title-1 MT30">
					<h3>${title}</h3><section><hr></section>
				</div>
			</c:otherwise>
		</c:choose>


			<c:choose>
				<c:when test="${component.popup}">
					<div class="carousel js-owl-carousel js-owl-lazy-reference js-owl-carousel-reference">
						<div id="quickViewTitle" class="quickView-header" style="display:none">
							<div class="headline">		
								<span class="headline-text"><spring:theme code="popup.quick.view.select"/></span>
							</div>
						</div>
						<c:forEach items="${productData}" var="product">

							<c:url value="${product.url}/quickView" var="productQuickViewUrl"/>
							<div class="item">
								<a href="${productQuickViewUrl}" class="js-reference-item">
									<div class="thumb">
										<product:productPrimaryReferenceImage product="${product}" format="product"/>
									</div>
									<div class="item-name">${product.name}</div>
									<div class="item-price"><format:fromPrice priceData="${product.price}"/></div>
								</a>
							</div>
						</c:forEach>
					</div>
				</c:when>
				<c:otherwise>
					<div class="row prdList">
					
						<c:forEach items="${productData}" var="product">

							<c:url value="${product.url}" var="productUrl"/>

							<c:choose>
								<c:when test="${component.size == 4}">
									<div class="col-sm-6 col-md-3">
								</c:when>
								<c:when test="${component.size == 5}">
									<div class="col-md-1-5">
								</c:when>
								<c:otherwise>
									<div class="col-md-1-5 col-xs-12 col-sm-6">
								</c:otherwise>
							</c:choose>
									<a href="${productUrl}">
<!-- 									<div class="thumb"> -->
										<product:productPrimaryImage product="${product}" format="product"/>
<!-- 									</div> -->
									<h3>${product.name}</h3>
									<p><span class="MR5"><format:fromPrice priceData="${product.price}"/></span></p>
									</a>
							</div>
						</c:forEach>
					</div>
				</c:otherwise>
			</c:choose>
	</c:when>

	<c:otherwise>
	3333
		<component:emptyComponent/>
	</c:otherwise>
</c:choose>

