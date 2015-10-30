<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>


<template:page pageTitle="${pageTitle}">
	<div class="container" id="wrapper">
	  		
	  	<section class="indexBN MB20">
	   		<cms:pageSlot position="Section1" var="feature" element="div" class="callbacks_container">
	   			<cms:component component="${feature}"  />
			</cms:pageSlot>   
	    </section>
	   	    
		<section class="stylePrds">
			<cms:pageSlot position="Section2" var="feature" element="h3" class="letter_3px MB15">
				<cms:component component="${feature}" />
			</cms:pageSlot> 
			
			<div class="row">
				<cms:pageSlot position="Section2A" var="feature" element="div" class="col-md-4 col-xs-12 col-sm-6">
					<cms:component component="${feature}" element="section" />
				</cms:pageSlot>
						
				<cms:pageSlot position="Section2B" var="feature" element="div" class="col-md-4 col-xs-12 col-sm-6">
					<cms:component component="${feature}" element="section" />
				</cms:pageSlot>
				
				<cms:pageSlot position="Section2C" var="feature" element="div" class="col-md-4 col-xs-12 col-sm-6">
					<cms:component component="${feature}" element="section" />
				</cms:pageSlot>
			</div>
		</section>
	
		<section class="recommendPrds">
			<cms:pageSlot position="Section3" var="feature" element="h3" class="letter_3px MB15">
				<cms:component component="${feature}" />
			</cms:pageSlot>
			<div class="row">
				
				<cms:pageSlot position="Section3A" var="feature" element="div" class="col-md-3 col-xs-6 col-sm-6">
					<cms:component component="${feature}" element="section"/>
				</cms:pageSlot>
					
				<cms:pageSlot position="Section3B" var="feature" element="div" class="col-md-3 col-xs-6 col-sm-6">
					<cms:component component="${feature}" element="section"/>
				</cms:pageSlot>
				
				<cms:pageSlot position="Section3C" var="feature" element="div" class="col-md-3 col-xs-6 col-sm-6">
					<cms:component component="${feature}" element="section"/>
				</cms:pageSlot>
				
				<cms:pageSlot position="Section3D" var="feature" element="div" class="col-md-3 col-xs-6 col-sm-6">
					<cms:component component="${feature}" element="section"/>
				</cms:pageSlot>
				
			</div>
		</section>
	
		<section class="hitoPrd">
			<cms:pageSlot position="Section4" var="feature" element="h3" class="letter_3px MB15">
				<cms:component component="${feature}"  />
			</cms:pageSlot>
			
			<cms:pageSlot position="Section4A" var="feature" >
				<cms:component component="${feature}"  />
			</cms:pageSlot>
		</section>
	
		<section class="recommendPrd">
			<cms:pageSlot position="Section5" var="feature" element="h3" class="letter_3px MB15">
				<cms:component component="${feature}"  />
			</cms:pageSlot>
			
			<cms:pageSlot position="Section5A" var="feature" >
				<cms:component component="${feature}"  />
			</cms:pageSlot>
		</section>
	
		<section class="narrowBN">
			
			<cms:pageSlot position="Section6" var="feature" element="div" class="row">
				<cms:component component="${feature}" element="div" class="col-md-12" />
			</cms:pageSlot>
			 
		</section>
		
		<section class="brand_Recommend MB30">
			<cms:pageSlot position="Section7" var="feature" element="h3" class="letter_3px MB15">
				<cms:component component="${feature}" />
			</cms:pageSlot>
			
			<div class="row">
				
				<cms:pageSlot position="Section7A" var="feature" element="div" class="col-md-5 col-lg-2-5" >
					<cms:component component="${feature}" element="div" class="brandGalleryImg"/>
				</cms:pageSlot>
		        
				<div class="col-md-7 col-lg-3-5"> 
					<cms:pageSlot position="Section7B" var="feature" >
						<cms:component component="${feature}"  />
					</cms:pageSlot>
	
					<cms:pageSlot position="Section7C" var="feature" >
						<cms:component component="${feature}"  />
					</cms:pageSlot>
				</div>
			</div>
		</section>
		
		
		<section class="brandSmallBn">
			<div class="row text-center">
				<cms:pageSlot position="Section8A" var="feature" element="div" class="col-lg-1-5">
					<cms:component component="${feature}"  />
				</cms:pageSlot>
				
				<cms:pageSlot position="Section8B" var="feature" element="div" class="col-lg-1-5">
					<cms:component component="${feature}"  />
				</cms:pageSlot>
				
				<cms:pageSlot position="Section8C" var="feature" element="div" class="col-lg-1-5">
					<cms:component component="${feature}"  />
				</cms:pageSlot>
				
				<cms:pageSlot position="Section8D" var="feature" element="div" class="col-lg-1-5">
					<cms:component component="${feature}"  />
				</cms:pageSlot>
				
				<cms:pageSlot position="Section8E" var="feature" element="div" class="col-lg-1-5">
					<cms:component component="${feature}"  />
				</cms:pageSlot>
		
			</div>
		</section>
		
	</div>
</template:page>