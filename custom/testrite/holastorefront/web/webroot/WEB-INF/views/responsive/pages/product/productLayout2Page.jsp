<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>

<template:page pageTitle="${pageTitle}">

<div class="row"> 
	<!--左版位-->
<div class="col-sm-4 col-md-3">
	<div class="title-3">
		<h3>${superCategory.name}</h3>
		<hr>
	</div>
	<nav class="leftNav">
		<ul class="nav">
		<c:forEach items="${subCategories}" var="subcategory">
			<li>
				<c:url value="${subcategory.url}" var="subcategoryurl"></c:url>
				<a href="${subcategoryurl}">${subcategory.name}</a>
			</li>
		</c:forEach>
		</ul>
	</nav>

<!--左側廣告-->
<div class="leftBN">
    <div class="row">
    <div class="col-xs-6 col-sm-12"><a href="#"><img src="/images/sample/BN_215x90.jpg" class="img-responsive"></a></div>
    <div class="col-xs-6 col-sm-12"><a href="#"><img src="/images/sample/BN_215x90.jpg" class="img-responsive"></a></div>
    <div class="col-xs-6 col-sm-12"><a href="#"><img src="/images/sample/BN_215x90.jpg" class="img-responsive"></a></div>
    </div>
</div>



</div><!--左版位End-->


	<div class="col-sm-8 col-md-9">
		
		<cms:pageSlot position="Section1" var="comp" element="div" class="productDetailsPageSection1">
			<cms:component component="${comp}"/>
		</cms:pageSlot>
		<product:productDetailsPanel />
		
<%-- 		<cms:pageSlot position="CrossSelling" var="comp" element="div" class="productDetailsPageSectionCrossSelling"> --%>
<%-- 			<cms:component component="${comp}"/> --%>
<%-- 		</cms:pageSlot> --%>
		<cms:pageSlot position="Section3" var="comp" element="div" class="productDetailsPageSection3">
			<cms:component component="${comp}"/>
		</cms:pageSlot>
		
		<div class="itemOtherTxt">
			<product:productPageTabs />
		</div>
		
		<product:productDetailsBuyAgainPanel />
		
		<cms:pageSlot position="UpSelling" var="comp" element="div" class="moreItem">
			<cms:component component="${comp}"/>
		</cms:pageSlot>
		
		<cms:pageSlot position="Section4" var="comp" element="div" class="productDetailsPageSection4">
			<cms:component component="${comp}"/>
		</cms:pageSlot>
	</div>
</div>	
</template:page>