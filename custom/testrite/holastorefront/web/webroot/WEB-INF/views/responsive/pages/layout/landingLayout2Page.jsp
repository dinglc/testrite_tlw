<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">
		<c:url value="/p/10481" var="prdurl"></c:url>
		<a href="${prdurl}">10481</a>
		<div class="no-space">
			<cms:pageSlot position="Section1" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>

			<div class="row">
				<cms:pageSlot position="Section2A" var="feature">
					<cms:component component="${feature}" element="div" class="col-xs-6 col-sm-3" />
				</cms:pageSlot>
				<cms:pageSlot position="Section2B" var="feature">
					<cms:component component="${feature}"  element="div" class="col-xs-6 col-sm-3" />
				</cms:pageSlot>
				<cms:pageSlot position="Section2C" var="feature" element="div" class="landingLayout2PageSection2C">
					<cms:component component="${feature}" element="div"/>
				</cms:pageSlot>
			</div>
		</div>
		<cms:pageSlot position="Section3" var="feature">
			<cms:component component="${feature}" />
		</cms:pageSlot>


		<div class="no-space">
		
			<div class="row">
				<cms:pageSlot position="Section4" var="feature" >
					<cms:component component="${feature}"  element="div" class="col-xs-6 col-sm-3"/>
				</cms:pageSlot>
			</div>
			
			<cms:pageSlot position="Section5" var="feature">
				<cms:component component="${feature}" />
			</cms:pageSlot>
		</div>
		
</template:page>