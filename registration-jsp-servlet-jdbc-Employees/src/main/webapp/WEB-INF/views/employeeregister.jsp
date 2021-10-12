<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center"> 
<h1>Employee register Form</h1>
<form action="<%=request.getContextPath() %>/register" method="post">
<table style="wi:80%">
<tr>
<td>First name</td>
<td><input type="text" name="firstName"/></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName"/></td>
</tr>
<tr>
<td>UserName</td>
<td><input type="text" name="userName"/></td>
</tr>
<tr>
<td>UserPassword</td>
<td><input type="password" name="userPassword"/></td>
</tr>
<tr>
<td>Email Id</td>
<td><input type="text" name="emailId"/></td>
</tr>
<tr>
<td>Address</td>
<td><input type= text name="address"/></td>
</tr>
<tr>
<td>Contact No</td>
<td><input type="text" name="contact"></td>
</tr>
</table>
<button class="btn success">Click Here</button>


</form>
</div>

</body>
</html>