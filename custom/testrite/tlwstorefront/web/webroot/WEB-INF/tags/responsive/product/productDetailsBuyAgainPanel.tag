<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format" %>

<!-- </div> -->
<c:if test="${product.stock.stockLevel gt 0}">
	<div class="buyItemAgain">
	
		<ul class="list-inline">
		    <li><b><spring:theme code="product.volumePrices.column.price"/></b><span>${product.price.listPrice}</span></li>
		    <c:if test="${product.stock.stockLevel gt 0}">
			    <li><b><spring:theme code="product.volumePrices.column.qa"/></b>
			    	<span>
			    		<select>
			    		<c:forEach var="i" begin="1" end="${product.stock.stockLevel}">
			   			<option>${i}</option>
						</c:forEach></select></span></li>
			</c:if>
		    <li class="topBorder">
		    <b><spring:theme code="product.volumePrices.column.webprice"/></b><span class="webPrice">${product.price.formattedValue}</span>
		    </li>
		    <li>
		    	<cms:pageSlot position="AddToCart" var="component">
					<cms:component component="${component}" />
				</cms:pageSlot>
		    </li>
		</ul>
	
	</div>
</c:if>

