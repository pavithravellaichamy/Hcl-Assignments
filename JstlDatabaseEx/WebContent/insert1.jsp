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
<sql:setDataSource var="database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/register" user="root" password="pass1234"/>  <%--creating connection --%>
<sql:update dataSource="${database}" var="result">
            INSERT INTO student(student_ID,student_Name,student_Address,student_Mobileno) VALUES (?,?,?,?);  <%--inserting values --%>
            <sql:param value="${param.student_ID}" />
            <sql:param value="${param.student_Name}" />
            <sql:param value="${param.student_Address}" />
            <sql:param value="${param.student_Mobileno}" />
</sql:update>
<%
out.print("You have inserted the value successfully <br>");
%>
<a href = "<c:url value = "index.jsp"/>">Home</a> <%--linking to another page --%>
</body>
</html>