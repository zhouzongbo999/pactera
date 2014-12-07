<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>Add Employee</title>
	</head>
	<body>
		<form action="AddEmployee.sp" method="post">
		<table>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Code:</td>
				<td><input type="text" name="code"></td>
			</tr>
			<tr>
				<td colspan=2>
					<input type="submit"> 
				</td>
			</tr>
		</table>
		</form>
	</body>
</html>
