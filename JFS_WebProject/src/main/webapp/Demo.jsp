<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MyWebPage</title>
</head>
<body bgcolor="powderblue">

<center>
Welcome all for Servlet Program.....!
</center>
<br>
<br>
<marquee>
Today date is:::
<%
	Date date=new Date();
	out.print(date.toString());
%>
</marquee>
<form method="post" action="GetMethod">
		<table>
			<tr>
				<td><h3>Enter Your ID:</h3></td>
				<td><input type="text" value="10" name="id"></td>
			</tr>
			<tr>
				<td><h3>Enter Your NAME:</h3></td>
				<td><input type="text" value="Mohan"name="name"></td>
			</tr>
			<tr>
				<td><h3>Enter Your DEPT:</h3></td>
				<td><input type="text" value="IT" name="dept"></td>
			</tr>
						<tr>
				<td><h3>Enter Your SALARY:</h3></td>
				<td><input type="text" value="50000"name="salary"></td>
			</tr>
						<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
			</table>
<br>
<br>
</form>
<center>
<button type="button">Click Me..!</button>
</center>
</body>
</html>