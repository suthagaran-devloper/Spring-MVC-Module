<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color: green;" align="center">Suthan software solution</h1>
<h2 style="color: blue;"align="center" >User   registration form</h2>
<table align="center" bgcolor="lightblue">
<form:form method="post" commandName="user">
<tr> 
	<td>First Name </td>
	<td> <form:input path="fname"/></td>
</tr>
<tr> 
	<td>Last Name </td>
	<td> <form:input path="lname"/></td>
</tr>
<tr>
	<td colspan="2">
		<input type="submit" name="_target1" value="Next"/>
		<input type="submit" name="_cancel" value="Cancel"/>
	</td>

</tr>
</form:form>
</table>
</form>
</body>
</html>