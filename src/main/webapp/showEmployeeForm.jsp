<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="showEmployeeById">
	<label> By ID</label>
	<input type="text" name="empId">
	<br>
	<input type="submit">
	</form>
	
	<br>
	<br>
	
	<form action="showEmployeeByName">
	<label> By Name</label>
	<input type="text" name="empFirstName">
	<br>
	<input type="submit">
	</form>
	<br>
</body>
</html>