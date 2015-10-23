<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<c:forEach items="${component.links}" var="link">
	<li>
		<cms:component component="${link}" />
	</li>
</c:forEach>
