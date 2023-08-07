<%@page import="org.eclipse.jdt.internal.compiler.ast.IfStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subtraction</title>
</head>
<body>
	<h2>Subtract Numbers</h2>
	<form action="scontroller" method="post">
	Enter first number<input type="text" name="num1"/>
	Enter second number<input type="text" name="num2"/>
	<input type="submit" value="subtract"/>
	</form>	
	
	<%
	if(request.getAttribute("val")!=null){
		out.println("The Result is=" +request.getAttribute("val"));
	}
	%>	
</body>
</html>