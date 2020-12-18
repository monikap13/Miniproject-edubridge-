<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h1>Employee Register</h1>
<form action="<%= request.getContextPath()%>/register" method="post">
<table>
<tr><td>Id</td><td><input type="int" name="admin_id"/></td></tr>
<tr><td>Name</td><td><input type="text" name="name"/></td></tr>
<tr><td>Username</td><td><input type="text" name="username"/></td></tr>
<tr><td>Password</td><td><input type="password" name="password"/></td></tr>

</table>

<input type="submit" value="SUBMIT">

</form>
</body>
</html>