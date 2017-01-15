<!DOCTYPE>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><c:out value="${title}"></c:out></title>
	</head>
	<body>
		<h1>
			<c:out value="${title}"></c:out>
		</h1>
		<p>
		<c:out value="${message}"></c:out>
		</p>
		<form:form modelAttribute="employeeListForm">
		<div><form:errors path="*"  /></div>
			<table>
				<tbody>
					<tr>
						<td><form:label path="name">社員名</form:label></td>
						<td><form:input path="name" size="20" /></td>
					</tr>
					<tr>
						<td><form:label path="age">年齢</form:label></td>
						<td><form:input path="age" size="20" /></td>
					</tr>
					<tr>
						<td><form:label path="memo">メモ</form:label></td>
						<td><form:textarea path="memo" cols="20" row="5" /></td>
					</tr>
				</tbody>
			</table>
			<input type="submit" />
		</form:form>

		<c:if test="${not empty employeeList}">
			<table border="1">
				<tbody>
					<tr>
						<th>社員名</th>
						<th>年齢</th>
						<th>メモ</th>
					</tr>
					<c:forEach var="employee" items="${employeeList}">
						<tr>
							<td><c:out value="${employee.name}"></c:out></td>
							<td><c:out value="${employee.age}"></c:out></td>
							<td><c:out value="${employee.memo}"></c:out></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

	</body>
</html>