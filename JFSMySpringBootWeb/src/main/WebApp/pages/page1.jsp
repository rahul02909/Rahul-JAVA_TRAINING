<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="MySpringBootWeb.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details</title>
</head>
<body>
Product Details:
<table border="1">
<tr>
<th style=" background-color: lightblue; ">Product ID</th>
<th style=" background-color: lightblue; ">Product Name</th>
<th style=" background-color: lightblue; ">Brand Name</th>
<th style=" background-color: lightblue; ">Price</th>
<th style=" background-color: lightblue; ">Stock Available</th>
</tr>
<tr><td>${Product.product_ID}</td>
<td>${Product.product_Name}</td>
<td>${Product.brand_Name}</td>
<td>${Product.price}</td>
<td>${Product.stock_available}</td></tr>
</table>
</body>
</html>