<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<cms:pageSlot position="NavigationBar" var="component">
	<c:choose>
		<c:when test="${fn:containsIgnoreCase(component.name,'main')}">
			<div class="row">
    			<div class="col-md-9 hidden-xs hidden-sm">
    				<nav id="mainNav">
						<cms:component component="${component}"/>
					</nav>
				</div>
				<div class="col-md-3  text-right">
			        <nav id="loginNav">
			        <ul class="nav nav-pills">
			          <li><span><spring:theme code="header.hello"/></span></li>
			          <li role="presentation"><a href="#">登入</a></li>
			          <li role="presentation"><a href="#">註冊</a></li>
			          <li role="presentation"><a href="#">顧客中心</a></li>
			        </ul>
			    </nav>
			    </div>
			</div>
		</c:when>
		<c:when test="${fn:containsIgnoreCase(component.name,'bread')}">
			<cms:component component="${component}"/>
		</c:when>
		<c:otherwise>
			<div class="row">
    			<div class="col-md-12">
    				<nav id="subNav">
						<cms:component component="${component}"/>
					</nav>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
</cms:pageSlot>
