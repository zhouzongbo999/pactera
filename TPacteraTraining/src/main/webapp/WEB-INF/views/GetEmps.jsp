<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Employee Info</title>
	</head>
	<body>
		<table>
			<tr>
				<td>ID</td>
				<td>NAME</td>
				<td>CODE</td>
				<td>MODIFY</td>
			</tr>
				<c:forEach items="${emps}" var="emp">
				<tr>
					<td>${emp.id}</td>
					<td>${emp.name}</td>
					<td>${emp.code}</td>
					<td><a href="UpdateEmployee?id=${emp.id}">Modify</a></td>
				</tr>
				</c:forEach>
		</table>
	</body>
</html>
