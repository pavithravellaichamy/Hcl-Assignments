<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${li}" var="l">
<c:out value="${l.emp_ID }"/> 
<c:out value="${l.emp_Name }"/>
<c:out value="${l.emp_Salary }"/><a href="./delete?emp_ID=${l.emp_ID }">Delete</a> <a href="./update?emp_ID=${l.emp_ID }">Edit</a><br>
</c:forEach>
</body>
</html>