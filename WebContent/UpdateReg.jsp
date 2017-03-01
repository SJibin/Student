<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Updating</title>
</head>
<body>
<h1>Update Student Record</h1>
	<form action="UpdateController" method="post">
		<table>
			<tr>
				<td>Student Id:</td>
				<td><input type="text" name="sId" /></td>
			</tr>
			<tr>
				<td>Student Name:</td>
				<td><input type="text" name="sName" /></td>
			</tr>
			<tr>
				<td>Contact No:</td>
				<td><input type="text" name="contactNo" /></td>
			</tr>
			<tr>
				<td>Percentage:</td>
				<td><input type="text" name="percentage" /></td>
			</tr>
			<tr>
			<td>Admission Date:</td>
			<td><input type="date" name="admissionDate"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Update" /></td>
				<td colspan="2"><a href="StudentReg.jsp"><input type="button" value="Add"></a></td>
				<td colspan="2"><a href="Delete.jsp"><input type="button" value="Delete"></a></td>
				
			</tr>
		</table>
	</form>

</body>
</html>