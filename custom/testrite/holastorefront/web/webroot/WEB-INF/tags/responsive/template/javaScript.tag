<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="g" uri="http://granule.com/tags/accelerator" %>
<%@ taglib prefix="compressible" tagdir="/WEB-INF/tags/responsive/template/compressible" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="cms" tagdir="/WEB-INF/tags/responsive/template/cms" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>

<c:url value="/" var="siteRootUrl"/>

<template:javaScriptVariables/>

<c:choose>
	<c:when test="${granuleEnabled}">
		<g:compress urlpattern="${encodingAttributes}">
			<compressible:js/>
		</g:compress>
	</c:when>
	<c:otherwise>
		<compressible:js/>
	</c:otherwise>
</c:choose>

<cms:previewJS cmsPageRequestContextData="${cmsPageRequestContextData}" />

<!-- InstanceBeginEditable name="JS" -->
<script>
$(document).ready(function() { 
$("#slider").responsiveSlides({
        auto: true,
        pager: true,
        nav: true,
        speed: 500,
        namespace: "callbacks"
 });
 $('.callbacks_tabs a').css('display','block').html('');
 
 $('.MainCategory>.leftNav>ul').hide();
 $('.MainCategory .leftNav .title-3').css('cursor','pointer');
 $('.MainCategory .leftNav .title-3').click(function(){
	 $('.MainCategory .leftNav>ul').hide(300);
	 $(this).parent().find('ul').show(300);
	 })
 $('.MainCategory .leftNav .title-3').eq(0).click();

})
</script>

<!-- InstanceEndEditable -->