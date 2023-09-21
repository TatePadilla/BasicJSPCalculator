<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tate's Calculator</title>
</head>
<body>
<h1>Welcome to Tate's adding and subtracting by 100 calculator!</h1>
<h3> Why use a regular calculator when this has all the functionality you need!</h3>

<form action="add100Servlet" method="post">
<p>Enter a number to add 100 to: <p>
<input type="text" name="add100" size="10">
<input type="submit" value="Calculate" />
</form>

<form action="subtract100Servlet" method="post">
<p>Enter a number to subtract 100 to: <p>
<input type="text" name="subtract100" size="10">
<input type="submit" value="Calculate" />
</form>
</body>
</html>
