<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">
	
<div class="container" id="wrapper">

	<section class="Slider">
		<cms:pageSlot position="Section1" var="feature" element="div" class="callbacks_container">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</section>
	
	<section class="mainBN">
		<cms:pageSlot position="Section2" var="feature">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</section>
	
	<section class="roomPrds">
		<cms:pageSlot position="Section3" var="feature" element="div" class="title-2">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
		<div class="row">
			<cms:pageSlot position="Section3A" var="feature" element="div" class="col-xs-6">
				<cms:component component="${feature}"/>
			</cms:pageSlot>
			<cms:pageSlot position="Section3B" var="feature" element="div" class="col-xs-6">
				<cms:component component="${feature}"/>
			</cms:pageSlot>
		</div>
	</section>
	
	<section class="hitoPrd">
		<cms:pageSlot position="Section4" var="feature">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
 	</section>
 	
 	<section class="recommendPrd">
		<cms:pageSlot position="Section5" var="feature">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</section>
	
	<section class="brandPrd">
	
		<cms:pageSlot position="Section6" var="feature" element="div" class="title-2">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
		
		<cms:pageSlot position="Section6A" var="feature" element="div" class="row brandTab MT20 hidden-xs">
			<cms:component component="${feature}" element="div" class="col-xs-1-5"/>
		</cms:pageSlot>
		
		<cms:pageSlot position="Section6B" var="feature" element="article">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
		
		<cms:pageSlot position="Section6C" var="feature" element="article">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
		
		<cms:pageSlot position="Section6D" var="feature" element="article">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
		
		<cms:pageSlot position="Section6E" var="feature" element="article">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
		
		<cms:pageSlot position="Section6F" var="feature" element="article">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
 	</section>
 	
	<section class="roomPrds">
		 
		<cms:pageSlot position="Section7" var="feature" element="div" class="title-2">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
			
		<div class="row">
			<cms:pageSlot position="Section7A" var="feature">
				<cms:component component="${feature}" element="div" class="col-md-3 col-xs-6 col-sm-6"/>
			</cms:pageSlot>
			
			<cms:pageSlot position="Section7B" var="feature">
				<cms:component component="${feature}" element="div" class="col-md-3 col-xs-6 col-sm-6"/>
			</cms:pageSlot>
			
			<cms:pageSlot position="Section7C" var="feature">
				<cms:component component="${feature}" element="div" class="col-md-3 col-xs-6 col-sm-6"/>
			</cms:pageSlot>
			
			<cms:pageSlot position="Section7D" var="feature">
				<cms:component component="${feature}" element="div" class="col-md-3 col-xs-6 col-sm-6"/>
			</cms:pageSlot>
		
		</div>
		
	</section>

	<section class="narrowBN">
	
		<cms:pageSlot position="Section8" var="feature" element="div" class="row">
			<cms:component component="${feature}" element="div" class="col-md-12"/>
		</cms:pageSlot>
		
	</section>
</div>
</template:page>
