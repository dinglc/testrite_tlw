<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component" %>

<c:choose>
	<c:when test="${not empty productData}">

			<h3 class="MB20  letter_3px">${title}</h3>

			<c:choose>
				<c:when test="${component.popup}">
					<div class="row prdList">
					
					
						<!--  <div id="quickViewTitle" class="quickView-header" style="display:none">
							<div class="headline">		
								<span class="headline-text"><spring:theme code="popup.quick.view.select"/></span>
							</div>
						</div> -->
						<c:forEach items="${productData}" var="product">

							<!--<c:url value="${product.url}/quickView" var="productQuickViewUrl"/>-->
							<div class="col-sm-6 col-md-4 col-lg-3">
                            <section>
                            <hr>
								<a href="${productQuickViewUrl}">
									
								    <product:productPrimaryReferenceImage product="${product}" format="product"/>
									
									<h3>${product.name}</h3>
									<p><span class="MR5"></span><span class="orangeColor"></span><span class="orangeColor font_20"><format:fromPrice priceData="${product.price}"/></span></p>
								</a>	
								
							</section>
							</div>
						</c:forEach>
					</div>
				</c:when>
				<c:otherwise>
					<div class="row prdList">
						<c:forEach items="${productData}" var="product">

							<c:url value="${product.url}" var="productUrl"/>

							<div class="col-sm-6 col-md-4 col-lg-3">
								<section>
              						<hr>
									<a href="${productUrl}">
<!-- 									<div class="thumb"> -->
										<product:productPrimaryImage product="${product}" format="product"/>
<!-- 									</div> -->
									<h3>${product.name}</h3>
									<p><span class="MR5"><format:fromPrice priceData="${product.price}"/></span>
									</a>
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

