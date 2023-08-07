<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add</title>
</head>
<body>
	<h2>Adding of numbers</h2>
	<form action="controller" method="post">
	Enter first number<input type="text" name="num1"/>
	Enter second number<input type="text" name="num2"/>
	<input type="submit" value="add"/>
	</form>
	<%
	if(request.getAttribute("result")!=null){
		out.println("The Result is= " +request.getAttribute("result"));
	}
	%>
	
	
</body>
</html>
