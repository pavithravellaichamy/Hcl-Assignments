<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<style>
.error{color:red}
</style>
</head>
<body>
<form:form action="register" modelAttribute="emp">
Employee code:  <form:input path="empcode"/> <br>
<form:errors path="empcode" cssClass="error"/><br>
 Employee Name: <form:input path="name"/> <br>
 <form:errors path="name" cssClass="error"/>
 Employee Password: <form:password path="pass"/> <br>
 Employee DOB: <form:input path="dob"/> <br>
 Employee Age:<form:input path="age"/> <br>
 <form:errors path="age" cssClass="error"/><br>
 Employee Email: <form:input path="email"/> <br>
 <form:errors path="email" cssClass="error"/><br>
 Employee Mobileno:<form:input path="mobileno"/> <br>
 Employee Email: <form:input path="mobileno"/> <br>
 Employee Experience:<form:input path="experience"/> <br>
 Employee Email: <form:input path="experience"/> <br>
 Employee Designation:<form:input path="designation"/> <br>
<input type="submit" value="submit">
</form:form>
</body>
</html>