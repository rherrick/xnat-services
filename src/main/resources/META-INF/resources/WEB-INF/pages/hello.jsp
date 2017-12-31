<jsp:useBean id="message" scope="request" type="java.lang.String"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<body>
<h1><spring:message code="hello.title"/></h1>

<h2>${message}</h2>
</body>
</html>
