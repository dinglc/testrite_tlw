<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ attribute name="galleryImages" required="true" type="java.util.List" %>

<div class="row MTB10">
	<div class="col-md-9 col-xs-9">
		<ul class="list-inline itemIcon ">
		    <c:forEach items="${galleryImages}" var="container" varStatus="varStatus">
		        <li><img src="${container.thumbnail.url}" alt="${container.thumbnail.altText}"></li>
		    </c:forEach>
	    </ul>
	</div>
</div>