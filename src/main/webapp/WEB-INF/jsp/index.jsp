<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>my first jsp file </title>
</head>
<body>
<p> my JSP  programming <%=new java.util.Date() %> </p>
<% out.print("welcom");
	for(int i =0 ; i<10; i++)
	{
		
		out.print(i +"\n");
	}
	out.print("welcom jsp");

%>
<h1>السلام وعليكم ورحمة الله وبركاتة </h1>
<a href="hello">for registration</a>
</body>
</html>