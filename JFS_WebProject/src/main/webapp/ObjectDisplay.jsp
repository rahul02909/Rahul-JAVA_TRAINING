<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="java.io.*"%>
    <%@page import="Employee.EmployeeDat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>PRODUCT ADDED</h3>
<%
EmployeeDat employee=(EmployeeDat)request.getAttribute("EMP");
out.print(employee.getEmpid());
out.print(employee.getEmpname());
out.print(employee.getQualification());
out.print(employee.getSalary());
%> 
</body>
</html>