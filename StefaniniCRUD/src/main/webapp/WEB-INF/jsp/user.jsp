<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Management</title>
</head>
<body>
<h1>Users Data</h1>
<form:form action="user.do" method="POST" commandName="user">
	<table>
		<tr>
			<td>Stefanini ID</td>
			<td><form:input path="stefaniniid"/></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><form:input path="stefanininame"/></td>
		</tr>
		<tr>
			<td>Description</td>
			<td><form:input path="stefaninidescription"/></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add"/>
				<input type="submit" name="action" value="Edit"/>
				<input type="submit" name="action" value="Delete"/>
				<input type="submit" name="action" value="Search"/>
			</td>
		</tr>
		
	</table>
</form:form>

<br>
<table border="1">
	<th>Stefanini ID</th>
	<th>Name</th>
	<th>Description</th>
	<c:forEach items="${userList}" var="user">
		<tr>
			<td>${user.stefaniniId}</td>
			<td>${user.stefaniniName}</td>
			<td>${user.stefaniniDescription}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>