<!DOCTYPE>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<p>${message}</p>
		<form:form modelAttribute="selectForm" action="${pageContext.request.contextPath}/sample/select/info/">
			<form:select path="employees" items="${selectEmployees}" multiple="true" />
			<input type="submit" />
		</form:form>
	</body>

</html>