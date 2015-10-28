<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<%--  AddOn Common CSS files --%>
<c:forEach items="${addOnCommonCssPaths}" var="addOnCommonCss">
	<link rel="stylesheet" type="text/css" media="all" href="${addOnCommonCss}"/>
</c:forEach>





<%-- Theme CSS files --%>
<%-- <link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/style_ori.css"/> --%>
<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/style.css"/>
<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/rwd.css"/>
<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/responsiveslides.css"/>
<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/normalize.css"/>
<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/main.css"/>
<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/bootstrap.css"/>
<link rel="stylesheet" type="text/css" media="all" href="${themeResourcePath}/css/IE8.css"/>

<%--  AddOn Theme CSS files --%>
<c:forEach items="${addOnThemeCssPaths}" var="addOnThemeCss">
	<link rel="stylesheet" type="text/css" media="all" href="${addOnThemeCss}"/>
</c:forEach>