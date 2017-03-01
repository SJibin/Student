<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deleting Student</title>
</head>
<body>
Please Enter the Student Id to be Delete
<form action="DeleteController" method="post">
<table>
<tr><td>Enter the Student Id:</td>
<td><input type="text" name="id"></td>
</tr>
<tr>
<td><input type="submit" value="Delete"></td>
</tr>
</table>
</form>
</body>
</html>