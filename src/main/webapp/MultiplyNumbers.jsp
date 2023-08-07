<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication</title>
</head>
<body>
	<form action="multiplyNum" method="post">	
	<h2>Multiply the numbers here</h2>
	Enter first number<input type="text" name="num1"/>
	Enter second number<input type="text" name="num2"/>
	<input type="submit" value="multiply"/>
	</form>
	
	<%
	if(request.getAttribute("result")!=null)
	out.println("The result is=" +request.getAttribute("result"));
	%>	
</body>
</html>