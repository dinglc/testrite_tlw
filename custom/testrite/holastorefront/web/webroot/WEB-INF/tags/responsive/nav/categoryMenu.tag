<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="MainCategory">
	<c:forEach items="${midcategories}" var="mid">
	<nav class="leftNav">
	<div class="title-3"><h3>${mid.key}</h3></div>
	    <ul class="nav">
	    	<c:forEach items="${mid.value}" var="last">
	              <li><a href=<c:url value="${last.url}"/>>${last.name}</a></li>
	        </c:forEach>
	    </ul>
	</nav>
	</c:forEach>
</div>	
