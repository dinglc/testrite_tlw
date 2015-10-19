<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<template:page pageTitle="${pageTitle}">

<div class="row"> 
	<!--左版位-->
	<div class="col-sm-4 col-md-3">
		<section class="LeftZone">
			<div class="title-3">
				<h3>
					<spring:theme code="text.maincategory"/>
				</h3><hr>
			</div>
			<nav class="leftNav">
				<ul class="nav">
					<c:if test="${not empty root}">
						<c:forEach items="${root}" var="rt">
							<li><a href="<c:url value="${rt.url}"/>">${rt.name}</a></li>
						</c:forEach>
					</c:if>
				</ul>
			</nav>
		</section>
	</div><!--左版位End-->
	<!--右版位-->
	<div class="col-sm-8 col-md-9">
	
	<!--分類頁Slider-->
		<section class="mainSlider">
			<div class="callbacks_container ">
		    	<cms:pageSlot position="Section2" var="feature">
					<cms:component component="${feature}" />
				</cms:pageSlot>
		     </div>    
		</section>
		
		<cms:pageSlot position="Section4" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>
				
	</div><!--右版位End-->
</div>
		
</template:page>