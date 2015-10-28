<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<template:page pageTitle="${pageTitle}">
	<c:url value="/p/10481" var="prdurl"></c:url>
	<a href="${prdurl}"></a>
<div class="container" id="wrapper">
	<section class="Slider">
		<div class="callbacks_container ">
			<cms:pageSlot position="Section1" var="feature">
				<cms:component component="${feature}"/>
			</cms:pageSlot>
		</div>
	</section>
	
	<section class="mainBN">
		<cms:pageSlot position="Section2" var="feature">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</section>
	
	<section class="roomPrds">
		<div class="title-2">
		<h3>
			<cms:pageSlot position="Section3" var="feature">
				<cms:component component="${feature}"/>
			</cms:pageSlot>
		</h3>
			<hr>
		</div>
		<div class="row">
			<cms:pageSlot position="Section3A" var="feature" element="div">
				<div class="col-xs-6">
					<cms:component component="${feature}"/>
				</div>
			</cms:pageSlot>
			<cms:pageSlot position="Section3B" var="feature" element="div">
				<div class="col-xs-6">
					<cms:component component="${feature}"/>
				</div>
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
	<div class="title-2">
		<cms:pageSlot position="Section6" var="feature">
			<cms:component component="${feature}"/>
		</cms:pageSlot>
	</div>
	<div class="row brandTab MT20 hidden-xs">
		<cms:pageSlot position="Section6A" var="feature">
			<div class="col-xs-1-5">
				<cms:component component="${feature}"/>
			</div>
		</cms:pageSlot>
	</div>
	<article>
		<cms:pageSlot position="Section6B" var="feature">
				<cms:component component="${feature}"/>
		</cms:pageSlot>
	</article>
	<article>
		<cms:pageSlot position="Section6C" var="feature">
				<cms:component component="${feature}"/>
		</cms:pageSlot>
	</article>
	<article>
		<cms:pageSlot position="Section6D" var="feature">
				<cms:component component="${feature}"/>
		</cms:pageSlot>
	</article>
	<article>
		<cms:pageSlot position="Section6E" var="feature">
				<cms:component component="${feature}"/>
		</cms:pageSlot>
	</article>
	<article>
		<cms:pageSlot position="Section6F" var="feature">
				<cms:component component="${feature}"/>
		</cms:pageSlot>
	</article>
 	</section>
 	
	 <section class="roomPrds">
		 <div class="title-2">
		 <h3>
			<cms:pageSlot position="Section7" var="feature">
				<cms:component component="${feature}"/>
			</cms:pageSlot>
		</h3>
		<hr></div>
		<div class="row">
			<cms:pageSlot position="Section7A" var="feature">
				<div class="col-md-3 col-xs-6 col-sm-6">
					<cms:component component="${feature}"/>
				</div>
			</cms:pageSlot>
			<cms:pageSlot position="Section7B" var="feature">
				<div class="col-md-3 col-xs-6 col-sm-6">
					<cms:component component="${feature}"/>
				</div>
			</cms:pageSlot>
			<cms:pageSlot position="Section7C" var="feature">
				<div class="col-md-3 col-xs-6 col-sm-6">
					<cms:component component="${feature}"/>
				</div>
			</cms:pageSlot>
			<cms:pageSlot position="Section7D" var="feature">
				<div class="col-md-3 col-xs-6 col-sm-6">
					<cms:component component="${feature}"/>
				</div>
			</cms:pageSlot>
		</div>
	</section>

	<section class="narrowBN">
		<div class="row">
			<cms:pageSlot position="Section8" var="feature">
				<div class="col-md-12">
					<cms:component component="${feature}"/>
				</div>
			</cms:pageSlot>
		</div>
	</section>
</div>
</template:page>
