<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>

<!-- </div> -->
<div class="row MB20">
	<div class="col-md-6">
		<h2 class="primaryColor">
			<ycommerce:testId
				code="productDetails_productNamePrice_label_${product.code}">
				${product.name}
			</ycommerce:testId>
		</h2>
	</div>
</div>
<div class="row mainItem">
	<div class="col-md-6">
		<product:productImagePanel galleryImages="${galleryImages}"
			product="${product}" />
	</div>
	<div class="col-md-6 PL20">
	  <em class="itimNotice MB20"><spring:theme code="product.itimNotice" /><span class="primaryColor ML5"><spring:theme code="product.primaryColor" /></span></em>
	  <ul class="itemDetail">
	    <li><b><spring:theme code="product.variants.itemNumber"/></b><span>${product.code}</span></li>
	    <li><b><spring:theme code="product.variants.size"/></b>
	    	<span><spring:theme code="product.variants.length"/>${product.productDimension.length}X
	    		<spring:theme code="product.variants.width"/>${product.productDimension.width}X
	    		<spring:theme code="product.variants.height"/>${product.productDimension.height}<spring:theme code="product.variants.size.cm" /></span></li>
	    <c:if test="${product.stock.stockLevel ge 0}">
	    <li><b><spring:theme code="product.variants.in.stock"/></b><span>${product.stock.stockLevel}</span></li></c:if>
	    <c:if test="${product.stock.stockLevel gt 0}">
	    <li><b><spring:theme code="product.volumePrices.column.qa"/></b>
	    	<span>
	    		<select>
	    		<c:forEach var="i" begin="1" end="${product.stock.stockLevel}">
	   			<option>${i}</option>
				</c:forEach></select></span></li>
		</c:if>
	    <li><b><spring:theme code="product.volumePrices.column.price"/></b><span>${product.price.listPrice}</span></li>
	    
	    <li class="topBorder">
	    <b><spring:theme code="product.volumePrices.column.webprice"/></b><span class="webPrice">${product.price.formattedValue}</span>
	    <c:choose>
	    	<c:when test="${product.stock.stockLevel gt 0}">
	    	<div>
		    	<cms:pageSlot position="AddToCart" var="component">
					<cms:component component="${component}" />
				</cms:pageSlot>
			<span class="ML10"><spring:theme code="product.moreWebPriceProduct"/></span></div>
	    </li>
	    
	    </c:when>
	    <c:otherwise>
	    	</li>
	    </c:otherwise>
	    </c:choose>
	    <li class="topBorder">
	    <section class="MB10">
		    <div class="fb-like" data-layout="button_count" data-share="true" data-href=""></div>
		    <c:if test="${product.stock.stockLevel gt 0}">
		    	<img src="/images/icon_point.png" class="ML10">
		    </c:if>
	    </section>
	    <p class="grayColor font_12"><spring:theme code="product.notice.price"/><br><spring:theme code="product.notice.product"/></p>
	    </li>
	    
	  </ul>

	</div>

<%-- 							<c:if test="${product.stock.stockLevel gt 0}"> --%>
<%-- 								<c:set var="productStockLevel">${product.stock.stockLevel}&nbsp; --%>
<%-- 									<spring:theme code="product.variants.in.stock"/> --%>
<%-- 								</c:set> --%>
<%-- 							</c:if> --%>
<%-- 							<c:if test="${product.stock.stockLevelStatus.code eq 'lowStock'}"> --%>
<%-- 								<c:set var="productStockLevel"> --%>
<%-- 									<spring:theme code="product.variants.only.left" arguments="${product.stock.stockLevel}"/> --%>
<%-- 								</c:set> --%>
<%-- 							</c:if> --%>
<%-- 							<c:if test="${product.stock.stockLevelStatus.code eq 'inStock' and empty product.stock.stockLevel}"> --%>
<%-- 								<c:set var="productStockLevel"> --%>
<%-- 									<spring:theme code="product.variants.available"/> --%>
<%-- 								</c:set> --%>
<%-- 							</c:if> --%>
</div>

