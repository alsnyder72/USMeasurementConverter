<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>US Fluid Measurement Results</title>
</head>
<body>
<p>${userMeasurementPouch.getOunces()} ounces contains the following: <br />
${userMeasurementPouch.getGallons()} gallons, <br />
${userMeasurementPouch.getQuarts()} quarts, <br />
${userMeasurementPouch.getPints()} pints, <br />
${userMeasurementPouch.getCups()} cups <br /><br />
And the remaining ounces could be either:<br />
${userMeasurementPouch.getTablespoons()} tablespoons or <br />
${userMeasurementPouch.getTeaspoons()} teaspoons. <br />
</p>
<a href="index.jsp">Select another amount of ounces.</a>
</body>
</html>