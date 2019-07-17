<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.io.PrintStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%---<%@page isErrorPage="true" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>异常</title>
</head>
<body>
${ex.localizedMessage}<br/><br/><br/><br/>
	<font color="red"> 
	<%
		Exception ex = (Exception)request.getAttribute("ex");
		
	ByteArrayOutputStream bos = new ByteArrayOutputStream();
	ex.printStackTrace(new PrintStream(bos));
	out.println(bos.toString());
	%>
	</font>
</body>
</html>