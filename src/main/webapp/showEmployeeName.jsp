<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<!-- search val with empty field -->

<!-- Dynamically filled form -->

<!-- For Name :: List -->
<p>Before 1st</p>

<ul>
    <c:forEach var="employee" items="${emolyee}">
        <li> ${employee.empId} , ${employee.empFirstName }</li>
    </c:forEach>
</ul>

<p>Before 2nd</p>

<c:if test="${not empty employee}">
    <c:forEach items="${employee}" var="employee">
       ${employee.empId} , ${employee.empFirstName }
</c:forEach>
</c:if>


<p>Before 3rd</p>



<c:forEach items="${sessionScope.employee}" var="employee">
    <tr>
        <td>Employee ID: <c:out value="${employee.eid}"/></td>
        <td>Employee Pass: <c:out value="${employee.ename}"/></td>  
    </tr>
</c:forEach>

<p>end</p>

</body>
</html>