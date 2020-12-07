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
<form action='insert1.jsp' method='get'>  <%--returns to another page --%>
Enter ID<input type="text" name="student_ID"/>
Enter Name<input type="text" name="student_Name"/>
Enter Address<input type="text" name="student_Address"/>
Enter Mobile Number<input type="text" name="student_Mobileno"/>
<input type="submit" name="submit"/>
</form>
</body>
</html>