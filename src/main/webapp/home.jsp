<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FUTURE@HRManagement</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 200px;
  background-color: #f1f1f1;
}

li a {
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
}

/* Change the link color on hover */
li a:hover {
  background-color: #555;
  color: white;
}
</style>
</head>
<body>
	<!-- ${emp.empId} , ${emp.empFirstName}--> 
	<!-- NavBar -->
	<h2>Whole Application's Navigation Bar</h2>

<ul>
  <li><a href="home.jsp">Home</a></li>
  <li><a href="addEmployee.jsp">Add Employee</a></li>
  <li><a href="showEmployeeForm.jsp">Search Employee</a></li>
  <li><a href="DeleteEmployeeForm.jsp">Delete Employee</a></li>
  <li><a href="searchForUpdate.jsp">Update Employee</a></li>
</ul>
</body>

</html>