<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="String" value="Welcome to JSPL tags"/>
<c:if test="${fn:contains(String, 'tags')}">  
   <p>yes.....String contains the word tags</p>  
</c:if>  

<c:if test="${fn:contains(String, 'Welcome')}">  
   <p>yes.....String contains the word Welcome</p>  
</c:if>  

Length of the String is: ${fn: length(String)}
<br>
Replace tags to Programming: ${fn:replace(String,"tags","Programming")}
<br><br><br>


<%
out.println(request.getClass());
out.println("\n<h5>"+application.getContextPath()+"\n<h5>");
out.println("\n<h5>"+page.getClass()+"\n from page<h5>");
out.println("\n<h5>"+config.getClass()+"\nfrom config<h5>");

int i=request.hashCode();
out.println("\n<h5>"+i+"<h5>\n");

out.println("\n<h5>"+response.getBufferSize()+"<h5>\n");

out.println("\n<h5>"+config.getServletName()+"\n-Servlet Name<h5>");

out.println("\n<h5>"+response.getContentType()+"\n-Content type<h5>");

out.println("\n<h5>"+request.getContentLength()+"\n-Length<h5>");

out.println("\n<h5>"+request.getCharacterEncoding()+"\n from page<h5>");

out.println("\n<h5>"+application.getEffectiveMajorVersion()+"\nEffective Major Version<h5>");

out.println("\n<h5>"+application.getEffectiveMinorVersion()+"\n Minor Version<h5>");

out.println("\n<h5>"+application.getMajorVersion()+"\nMajor Version<h5>");

out.println("\n<h5>"+application.getRequestCharacterEncoding()+"<h5>");

out.println("\n<h5>"+application.getServerInfo()+"\nServer Info<h5>");

out.println("\n<h5>"+application.getEffectiveMajorVersion()+"\nMajor Version<h5>");

out.println("\n<h5>"+application.getEffectiveMajorVersion()+"\nMajor Version<h5>");
String s1=application.getContextPath();
String s2=application.getRealPath(s1);
out.println("\n<h5>"+s2+"\n-Path<h5>");

%>
<br><br>

</body>
</html>