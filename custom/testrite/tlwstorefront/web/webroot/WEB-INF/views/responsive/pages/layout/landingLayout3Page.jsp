<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav"%>

<template:page pageTitle="${pageTitle}">

<div class="row"> 
	<!--左版位-->
	<div class="col-sm-4 col-md-3">
		<section class="LeftZone">
			<c:choose>
				<c:when test="${empty subcategories && not empty midcategories}">
					<nav:categoryMenu/>
				</c:when>
				<c:otherwise>
					<div class="title-3">
						<h3>
							<spring:theme code="text.maincategory"/>
						</h3><hr>
					</div>
					<nav class="leftNav">
						<ul class="nav">
							<c:if test="${not empty subcategories}">
								<c:forEach items="${subcategories}" var="sub">
									<li><a href="<c:url value="${sub.url}"/>">${sub.name}</a></li>
								</c:forEach>
							</c:if>
						</ul>
					</nav>
				</c:otherwise>
			</c:choose>
			
			<cms:pageSlot position="Section1A" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
			
			<!--品牌專區-->
			<div class="brandZone">
			    <div class="title-3">
				    <h3>
				    	<spring:theme code="text.brands"/>
				    </h3>
				    <hr>
			    </div>
			    
			    <nav class="leftNav">
					<cms:pageSlot position="BrandSlot" var="feature" element="ul" class="nav">
						<cms:component component="${feature}" />
					</cms:pageSlot>
			    </nav>
			</div>
			
			<cms:pageSlot position="Section1B" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
			
			<!--熱銷排行-->
			<cms:pageSlot position="HotSellingSlot" var="feature" element="div" class="hotItem">
				<cms:component component="${feature}" />
			</cms:pageSlot>
			
			<cms:pageSlot position="Section1C" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
			
			<!--左側廣告-->
			<div class="leftBN MB20 hidden-xs">
    			<cms:pageSlot position="LeftAdSlot" var="feature" element="div" class="row">
    				<cms:component component="${feature}" element="div" class="col-xs-6 col-sm-12"/>
    			</cms:pageSlot>
    		</div>
    		
    		<cms:pageSlot position="Section1D" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
		</section>
	</div><!--左版位End-->
	
	<!--右版位-->
	<div class="col-sm-8 col-md-9">
		
		<cms:pageSlot position="ProductListSlot" var="feature" element="div" class="sub-itemGategory">
			<cms:component component="${feature}" />
		</cms:pageSlot>
		
		<!--分類頁Slider-->
		<section class="mainSlider">
			<cms:pageSlot position="RotatingImagesSlot" var="feature" element="div" class="callbacks_container">
				<cms:component component="${feature}" />
			</cms:pageSlot>
		</section>
		
		<section class="smallBn">
			<c:set value="0" var="i"/>
			<cms:pageSlot position="AdSlot" var="feature">
				<c:set value="${i+1}" var="i"/>
				<c:choose>
					<c:when test="${i < 4}">
						<cms:component component="${feature}" element="div" class="col-xs-6 col-md-4 col-lg-3"/>
					</c:when>
					<c:otherwise>
						<cms:component component="${feature}" element="div" class="col-xs-6 col-md-4 col-lg-3 hidden-md"/>
					</c:otherwise>
				</c:choose>
			</cms:pageSlot>
		</section>
		
		<cms:pageSlot position="Section2" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>		
		
		<cms:pageSlot position="Section3" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>
		
		<cms:pageSlot position="Section4" var="feature" element="div" class="itemRecommend">
			<cms:component component="${feature}" />
		</cms:pageSlot>
		
		<cms:pageSlot position="Section5" var="feature" element="div" class="itemFinalSold">
			<cms:component component="${feature}" />
		</cms:pageSlot>
				
		<cms:pageSlot position="Section6" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>		
		
		<cms:pageSlot position="Section7" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>		
		
		<cms:pageSlot position="Section8" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>		
		
	</div><!--右版位End-->
</div>
		
</template:page>