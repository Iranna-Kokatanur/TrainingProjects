<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Location: ${location}</h1>
<br>
<br>
<table>
<tr>
<td>CampNameId</td>
<td>CampName</td>
<td>Location</td>
<td>DateOfHeld</td>

</tr>
<c:forEach items="${data}" var="eachItem">
<tr>
<td>${eachItem.regNumber}</td>
<td>${eachItem.donationCampName}</td>
<td>${eachItem.location }</td>
<td>${eachItem.date}</td>

</tr>
</c:forEach>
</table>
</body>
</html>