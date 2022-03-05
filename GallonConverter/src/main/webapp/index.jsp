<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gallon Converter Home Page</title>
</head>
<body>
	<h1>US Fluid Measurement Converter</h1>
	<form action="getGallonsServlet" method="post">
	Enter the number of fluid ounces you have in a whole number:
	<input type="text" name="userOunces" size="10">
	<input type="submit" value="Calculate Measures" />
	</form>
	
	<h1>US Dry Measurement Converter</h1>
	<form action="getDryServlet" method="post">
	Enter the number of dry ounces you have in a whole number:
	<input type="text" name="userOunces" size="10">
	<input type="submit" value="Calculate Measures" />
	</form>
</body>
</html>