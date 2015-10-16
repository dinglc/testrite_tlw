<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="bread" tagdir="/WEB-INF/tags/responsive/nav/breadcrumb" %>

<template:page pageTitle="${pageTitle}">

	<div class="row">
	
	<cms:pageSlot position="Section1" var="comp">
	
		<bread:mkbreadcrumb component="${comp}" mkcode="${mkcode}" />
		<div class="col-sm-4 col-md-3"> 
		<cms:component component="${comp}"/>
		
	</cms:pageSlot>
	</div>
	<c:choose>
		<c:when test="${not empty mksubcode}">
			<jsp:include page="../mk/${mksubcode}.jsp"></jsp:include>
		</c:when>
		<c:otherwise>
			<jsp:include page="../mk/${mkcode}.jsp"></jsp:include>
		</c:otherwise>
	</c:choose>
	</div>
</template:page>