<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Details</h2>
<sql:setDataSource var="database" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/register" user="root" password="pass1234"/> <%-- creating connection --%>
<a href='insert.jsp'>Insert</a><br>  <%--links to another page --%>
<a href='update.jsp'>Update</a><br>
<a href='delete.jsp'>Delete</a><br>
<sql:query dataSource="${database}" var="rs">select * from student;</sql:query> <%--executing query --%>
<table border="0" width="100%">  
<tr>  
<th>Student ID</th>  
<th>Student Name</th>  
<th>Student Address</th>  
<th>Student Mobile Number</th>  
</tr>  
<c:forEach var="r" items="${rs.rows}">  
<tr>  
<td><c:out value="${r.student_ID}"/></td>  <%--retrieving values --%>
<td><c:out value="${r.student_Name}"/></td>  
<td><c:out value="${r.student_Address}"/></td>  
<td><c:out value="${r.student_Mobileno}"/></td>  
</tr>  
</c:forEach>  
</table>  
</body>
</html>