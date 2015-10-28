<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<div class="itemOtherTxt">

	<div class="btn-group btn-group-justified articleBtn" role="group" aria-label="...">
	  <div class="btn-group" role="group">
	    <button type="button" class="btn">商品特色</button>
	</div>
	  <div class="btn-group" role="group">
	    <button type="button" class="btn"><spring:theme code="product.product.details" /></button>
	</div>
	  <div class="btn-group" role="group">
	    <button type="button" class="btn"><spring:theme code="product.product.spec" /></button>
	</div>
	    <div class="btn-group" role="group">
	    <button type="button" class="btn">購買須知</button>
	</div>
	</div>

	<!--文章列表-->
	<article>
	<h4 class="MB15">商品特色</h4>
	  <p>德國BWT以家庭用水的安全、衛生和健康為原則，及傳統軟水機為基礎。獨家研發的奈米離子防垢過濾活水系統，掀起家庭用水處理技術的革命。</p>
	      <p>BWT奈米離子能量活化設備運作原理來自獨步全球的雙電極技術（blpolar-technology)，藉由精準控制電流及電壓脈衝形成極小的奈米結晶體，利用奈米結晶體穩定水中的鈣鎂離子及其他溶解於水中的礦物質，避免這些物質沉積於用水管路及熱水器中。水垢份子將無法在管路、用水設備或是熱水器中沉積結垢。</p>
	    <p>水通過AQA nano 能量活水設備濾芯時，在濾芯內，礦物質會被轉化為奈米結晶體結構並保持為懸浮粒子，其結果是，水中的鈣、鎂硬度離子將保留在水中，而不是沉</p>
	</article>
	
	<article>
		<product:productDetailsTab product="${product}" />
	</article>
	
	<article>
	<product:productDetailsClassifications product="${product}" />
	</article>
	
	<article>
	<h4 class="MB15">購買須知</h4>
	  <p>德國BWT以家庭用水的安全、衛生和健康為原則，及傳統軟水機為基礎。獨家研發的奈米離子防垢過濾活水系統，掀起家庭用水處理技術的革命。</p>
	      <p>BWT奈米離子能量活化設備運作原理來自獨步全球的雙電極技術（blpolar-technology)，藉由精準控制電流及電壓脈衝形成極小的奈米結晶體，利用奈米結晶體穩定水中的鈣鎂離子及其他溶解於水中的礦物質，避免這些物質沉積於用水管路及熱水器中。水垢份子將無法在管路、用水設備或是熱水器中沉積結垢。</p>
	    <p>水通過AQA nano 能量活水設備濾芯時，在濾芯內，礦物質會被轉化為奈米結晶體結構並保持為懸浮粒子，其結果是，水中的鈣、鎂硬度離子將保留在水中，而不是沉</p>
	</article>

<!-- 	<div class="tabhead"> -->
<%-- 		<a href=""><spring:theme code="product.product.details" /></a> <span --%>
<!-- 			class="glyphicon"></span> -->
<!-- 	</div>	 -->
<!-- 	<div class="tabbody"> -->
<%-- 		<product:productDetailsTab product="${product}" /> --%>
<!-- 	</div> -->

<!-- 	<div class="tabhead"> -->
<%-- 		<a href=""><spring:theme code="product.product.spec" /></a> <span --%>
<!-- 			class="glyphicon"></span> -->
<!-- 	</div> -->
<!-- 	<div class="tabbody"> -->
<%-- 		<product:productDetailsClassifications product="${product}" /> --%>
<!-- 	</div> -->
	
<!-- 	<div id="tabreview" class="tabhead"> -->
<%-- 		<a href=""><spring:theme code="review.reviews" /></a> <span --%>
<!-- 			class="glyphicon"></span> -->
<!-- 	</div>	 -->
<!-- 	<div class="tabbody"> -->
<%-- 		<product:productPageReviewsTab product="${product}" /> --%>
<!-- 	</div> -->

	<cms:pageSlot position="Tabs" var="tabs">
		<cms:component component="${tabs}" />
	</cms:pageSlot>

</div>
