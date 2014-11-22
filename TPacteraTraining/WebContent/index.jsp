<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee</title>
</head>
<body>
<form action="AddEmployeeCtrl" method="post">
	Name:<input type="text" name="name"></input>
	Code:<input type="text" name="code"></input>
	<button type="submit">Submit</button>
</form>
	<table>
		<tr>
			<td>ID</td>
			<td>NAME</td>
			<td>CODE</td>
		</tr>
		<c:forEach items="${ employees}" var="employee">
			<tr>
				<td>
					${employee.id}
				</td>
				<td>
					${employee.name}
				</td>
				<td>
					${employee.code}
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>