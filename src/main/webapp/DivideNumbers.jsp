<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Division</title>
</head>
<body>
	<h2>Divide the numbers here</h2>
	<form action="divideController" method="post">
	Enter first number<input type="text" name="num1"/>
	Enter second number<input type="text" name="num2"/>
	<input type="submit" value="divide"/>
	</form>
	
	<%
	if(request.getAttribute("val")!=null){
		out.println("The result is=" +request.getAttribute("val"));
	}
	%>
	
	
	
	
</body>
</html>