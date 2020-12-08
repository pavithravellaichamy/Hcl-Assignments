<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/register" user="root" password="pass1234"/>  <%--connection to database --%>
<sql:update dataSource="${database}" var="result">
            DELETE from student where student_ID='${param.student_ID}'  <%--delete a row from table --%>
</sql:update>
<%
out.print("You have deleted the value successfully <br>");
%>
<a href = "<c:url value = "index.jsp"/>">Home</a>
</body>
</html>