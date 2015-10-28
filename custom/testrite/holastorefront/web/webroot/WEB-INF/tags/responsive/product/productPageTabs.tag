<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>

<div class="itemOtherTxt">

	<div class="btn-group btn-group-justified articleBtn" role="group" aria-label="...">
	  <div class="btn-group" role="group">
	    <button type="button" class="btn">�ӫ~�S��</button>
	</div>
	  <div class="btn-group" role="group">
	    <button type="button" class="btn"><spring:theme code="product.product.details" /></button>
	</div>
	  <div class="btn-group" role="group">
	    <button type="button" class="btn"><spring:theme code="product.product.spec" /></button>
	</div>
	    <div class="btn-group" role="group">
	    <button type="button" class="btn">�ʶR����</button>
	</div>
	</div>

	<!--�峹�C��-->
	<article>
	<h4 class="MB15">�ӫ~�S��</h4>
	  <p>�w��BWT�H�a�x�Τ����w���B�åͩM���d����h�A�ζǲγn��������¦�C�W�a��o���`�����l�����L�o�����t�ΡA�Ȱ_�a�x�Τ��B�z�޳N�����R�C</p>
	      <p>BWT�`�����l��q���Ƴ]�ƹB�@��z�ӦۿW�B���y�����q���޳N�]blpolar-technology)�A�ǥѺ�Ǳ���q�y�ιq���߽ħΦ����p���`�̵�����A�Q�Ω`�̵�����í�w�������t�����l�Ψ�L���ѩ�������q����A�קK�o�Ǫ���I�n��Τ��޸��μ��������C�������l�N�L�k�b�޸��B�Τ��]�ƩάO���������I�n�����C</p>
	    <p>���q�LAQA nano ��q�����]���o��ɡA�b�o�䤺�A�q����|�Q��Ƭ��`�̵����鵲�c�ëO�����a�B�ɤl�A�䵲�G�O�A�������t�B��w�����l�N�O�d�b�����A�Ӥ��O�I</p>
	</article>
	
	<article>
		<product:productDetailsTab product="${product}" />
	</article>
	
	<article>
	<product:productDetailsClassifications product="${product}" />
	</article>
	
	<article>
	<h4 class="MB15">�ʶR����</h4>
	  <p>�w��BWT�H�a�x�Τ����w���B�åͩM���d����h�A�ζǲγn��������¦�C�W�a��o���`�����l�����L�o�����t�ΡA�Ȱ_�a�x�Τ��B�z�޳N�����R�C</p>
	      <p>BWT�`�����l��q���Ƴ]�ƹB�@��z�ӦۿW�B���y�����q���޳N�]blpolar-technology)�A�ǥѺ�Ǳ���q�y�ιq���߽ħΦ����p���`�̵�����A�Q�Ω`�̵�����í�w�������t�����l�Ψ�L���ѩ�������q����A�קK�o�Ǫ���I�n��Τ��޸��μ��������C�������l�N�L�k�b�޸��B�Τ��]�ƩάO���������I�n�����C</p>
	    <p>���q�LAQA nano ��q�����]���o��ɡA�b�o�䤺�A�q����|�Q��Ƭ��`�̵����鵲�c�ëO�����a�B�ɤl�A�䵲�G�O�A�������t�B��w�����l�N�O�d�b�����A�Ӥ��O�I</p>
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
