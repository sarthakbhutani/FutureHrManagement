<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/submitUpdateEmployee">
<input type="text" name="empId" value="${employee.empId}">
<br>
<input type="text" name="empFirstName" value="${employee.empFirstName}">
<br>
<input type="submit">
<c:choose>
    <c:when test="${empty user}">
        I see!  You don't have a name.. well.. Hello no name
    </c:when>
</c:choose>

</form>
</body>
</html>