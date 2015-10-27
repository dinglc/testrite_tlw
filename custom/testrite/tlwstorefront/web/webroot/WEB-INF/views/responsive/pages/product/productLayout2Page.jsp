<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<template:page pageTitle="${pageTitle}">
	<div class="row"> 
	<!--左版位-->
	<div class="col-sm-4 col-md-3">
		<section class="LeftZone">
			
			<c:if test="${not empty midcategories}">
				<nav:categoryMenu/>
			</c:if>	
			
			<cms:pageSlot position="Section1A" var="comp">
				<cms:component component="${comp}" />
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
					<cms:pageSlot position="BrandSlot" var="comp" element="ul" class="nav">
						<cms:component component="${comp}" />
					</cms:pageSlot>
			    </nav>
			</div>
			
			<cms:pageSlot position="Section1B" var="comp">
				<cms:component component="${comp}" />
			</cms:pageSlot>
			
			<!--熱銷排行-->
			<cms:pageSlot position="HotSellingSlot" var="comp" element="div" class="hotItem">
				<cms:component component="${comp}" />
			</cms:pageSlot>
			
			<cms:pageSlot position="Section1C" var="comp">
				<cms:component component="${comp}" />
			</cms:pageSlot>
			
			<!--左側廣告-->
			<div class="leftBN MB20 hidden-xs">
    			<cms:pageSlot position="LeftAdSlot" var="comp" element="div" class="row">
    				<cms:component component="${comp}" element="div" class="col-xs-6 col-sm-12"/>
    			</cms:pageSlot>
    		</div>
    		
    		<cms:pageSlot position="Section1D" var="comp">
				<cms:component component="${comp}" />
			</cms:pageSlot>
		</section>
	</div><!--左版位End-->
	
	<!--右版位-->
	<div class="col-sm-8 col-md-9">
		
	<cms:pageSlot position="Section2" var="comp" element="div" class="productDetailsPageSection1">
		<cms:component component="${comp}"/>
	</cms:pageSlot>
	<product:productDetailsPanel />
	<cms:pageSlot position="CrossSelling" var="comp" element="div" class="productDetailsPageSectionCrossSelling">
		<cms:component component="${comp}"/>
	</cms:pageSlot>
	<cms:pageSlot position="Section3" var="comp" element="div" class="productDetailsPageSection3">
		<cms:component component="${comp}"/>
	</cms:pageSlot>
	<cms:pageSlot position="UpSelling" var="comp" element="div" class="productDetailsPageSectionUpSelling">
		<cms:component component="${comp}"/>
	</cms:pageSlot>
	<product:productPageTabs />
	<cms:pageSlot position="Section4" var="comp" element="div" class="productDetailsPageSection4">
		<cms:component component="${comp}"/>
	</cms:pageSlot>	
		
	</div><!--右版位End-->
</div>
	
</template:page>