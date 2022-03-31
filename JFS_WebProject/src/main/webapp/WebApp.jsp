<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DETAILS</title>
</head>
<body bgcolor="purple">
<center>
<br>
<h2>ENTER YOUR DETAILS</h2>
</center>
	<form method="post" action="productDisplayPage">
		<table>
			<tr>
				<td><h3>Product id</h3></td>
				<td><input type="text" name="productid"></td>
			</tr>
			<tr>
				<td><h3>Product name</h3></td>
				<td><input type="text" name="productname"></td>
			</tr>
			<tr>
				<td><h3>product brand</h3></td>
				<td><input type="radio" name = "redmi" value="redmi"> REDMI</td>
       			<td><input type="radio" name = "oppo" value="oppo"> OPPO </td>
       			<td><input type="radio" name = "vivo" value="vivo"> VIVO </td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
				
		</table>
	</form>
</body>
</html>