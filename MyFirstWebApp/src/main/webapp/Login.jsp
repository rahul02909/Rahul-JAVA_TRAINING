<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<body bgcolor="Purple">
<br>
<center>
<h2>Enter Login Details</h2>
</center>
<center>
<form method="post" action="FirstDisplayPage">
		<table>
			<tr>
				<td><h3>USERNAME</h3></td>
				<td><input type="text" name="username"></td>
			</tr>
						<tr>
				<td><h3>PASSWORD</h3></td>
				<td><input type="password" name="pass"></td>
			</tr>
									<tr>
				<td><h3>CONFIRM PASSWORD</h3></td>
				<td><input type="password" name="cpass"></td>
			</tr>
			<tr>
				<td><input type="submit" value="LOGIN"></td>
			</tr>
				
		</table>
	</form>
</center>
</body>
</html>