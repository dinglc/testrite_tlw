<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="hideHeaderLinks" required="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav"%>

<cms:pageSlot position="TopHeaderSlot" var="component" element="div" class="btnTop">
	<cms:component component="${component}" />
</cms:pageSlot>

<!--購物車-->
<cms:pageSlot position="MiniCart" var="cart" limit="1" element="div" class="shopping_icon">
	<cms:component component="${cart}" />
</cms:pageSlot>

<header class="main-header main-header-md">
<div id="topZone"> 
	<div class="container">
		<div class="row">
			<div class="col-md-2  col-xs-2 col-sm-5">
				<h1 class="logo">
					<cms:pageSlot position="SiteLogo" var="logo" limit="1">
						<cms:component component="${logo}" />
					</cms:pageSlot>
				</h1>
			</div>
			<div class="col-md-7 hidden-xs hidden-sm">
                <!--主選單-->
                  <nav id="mainNav">
                  	<nav:topNavigation />
                 </nav>
               <!--主選單End-->        
           </div>
			<div class="col-md-3  col-xs-8 col-sm-6 text-right">
<!-- 			<div class="col-sm-12 col-md-8"> -->
<!-- 				<div class="md-secondary-navigation"> -->
						<nav id="loginNav" class="hidden-xs">
							<ul class="nav nav-pills">
<%-- 						<c:if test="${empty hideHeaderLinks}"> --%>
<%-- 							<c:if test="${uiExperienceOverride}"> --%>
<%-- 								<li class="backToMobileLink"><c:url --%>
<%-- 										value="/_s/ui-experience?level=" var="backToMobileStoreUrl" /> --%>
<%-- 									<a href="${backToMobileStoreUrl}"> <spring:theme --%>
<%-- 											code="text.backToMobileStore" /> --%>
<!-- 								</a></li> -->
<%-- 							</c:if> --%>


							<sec:authorize ifNotGranted="ROLE_ANONYMOUS">
								<c:set var="maxNumberChars" value="25" />
								<c:if test="${fn:length(user.firstName) gt maxNumberChars}">
									<c:set target="${user}" property="firstName" value="${fn:substring(user.firstName, 0, maxNumberChars)}..." />
 								</c:if> 

								<li>
									<span>
									<ycommerce:testId code="header_LoggedUser">
										<spring:theme code="header.welcome" arguments="${user.firstName},${user.lastName}" htmlEscape="true" />
									</ycommerce:testId>
									</span>
								</li>
							</sec:authorize>

<%--                      <cms:pageSlot position="HeaderLinks" var="link"> --%>
<%--                          <cms:component component="${link}" element="li"/> --%>
<%--                      </cms:pageSlot> --%>


							<sec:authorize ifAnyGranted="ROLE_ANONYMOUS">
								<li>
									<span>
										<spring:theme code="header.hello"/>
									</span>
								</li>
								<li class="liOffcanvas">
									<ycommerce:testId code="header_Login_link">
										<a href="<c:url value="/login"/>">
											<spring:theme code="header.link.login" />
										</a>
									</ycommerce:testId>
								</li>
							</sec:authorize>

							<sec:authorize ifNotGranted="ROLE_ANONYMOUS">
								<li class="liOffcanvas">
									<ycommerce:testId code="header_signOut">
										<a href="<c:url value='/logout'/>">
											<spring:theme code="header.link.logout" />
										</a>
									</ycommerce:testId>
								</li>
							</sec:authorize>
							
							<li role="presentation"><a href="#">顧客中心</a></li>

<%-- 						</c:if> --%>

					</ul>
<!-- 				</div> -->

<!-- 			</div> -->
			
              	</nav>
              	
            	<cms:pageSlot position="SearchBox" var="component">
                	<cms:component component="${component}" />
                </cms:pageSlot>
            </div>
            <!--MobileMenu-->
           <div class="mobileMenu hidden-md hidden-lg col-xs-2 col-sm-1 text-right">
                <a href="#"><span class="glyphicon glyphicon-tasks" aria-hidden="true"></span></a>
           </div>
		</div>
		<div class="row">
	      <!--Mobile選單-->
	      <div class="col-xs-12 hidden-md hidden-lg">
	           <nav id="mobileNav">
	           <ul class="nav" >
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>登入</a></li>
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>新註冊</a></li>
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>顧客中心</a></li>
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>線上購物</a></li>
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>網購獨享</a></li>
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>出清</a></li>
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>團購</a></li>
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>新品預購</a></li>
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>熱銷排行</a></li>
	                  <li role="presentation"><a href="#"><span class="MR10 glyphicon glyphicon-chevron-right" aria-hidden="true"></span>品牌總覽</a></li>
	           </ul>
	           </nav>
	      </div>
	    </div><!--rowEnd--> 
	</div>
</div>
<div id="subNav">
	<div class="container">     
        <div class="row">
        <div class="col-md-10 col-md-offset-2">
			<cms:pageSlot position="BottomHeaderSlot" var="component">
				<c:choose>
				<c:when test="${fn:containsIgnoreCase(component.name,'sub') }">
					<div class="btn-group" role="group" aria-label="...">
						<cms:component component="${component}" />
					</div>
					</div>
		</div>
	</div>
</div>
</header>
				</c:when>
				<c:otherwise>
				<div class="container" id="wrapper"> 
					<cms:component component="${component}" />
				</div>
				</c:otherwise>
				</c:choose>
			</cms:pageSlot>
		



