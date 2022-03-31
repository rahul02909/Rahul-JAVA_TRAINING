<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Received Values</title>
<style>
         table, th,
         td {
            border: 5px solid black;
            padding: 10px;
             text-align: center;
         }
          th {
        text-align: center;
    }
      table {
        border-spacing: 5px;
        background-color:powderblue;
    }
      </style>
</head>
<body>
   <center>
      <h1 >DETAILS</h1>
      <table style="width:50%">
         <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>DEPT</th>
            <th>STATE</th>
         </tr>
         <tr>
         <td>${id}</td>
         <td>${name}</td>
         <td>${dept}</td>
         <td>${salary}</td>
         </tr>
         </table>
     </center>    
</body>
</html>