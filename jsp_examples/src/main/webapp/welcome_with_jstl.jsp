<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="menu.html" %>
<c:set var="Location" value="Chennai" scope="session"/>
<c:set var="name" value="Ramesh" scope="session"/>

<c:out value = "${'hello'}"/>
<c:out value = "${'I am from jsp'}"/>
<c:out value = "${name} ${Location}"/>
<a href="showName.jsp">Continue</a>
<%=session.isNew() %>
<%=session.getId() %>
</body>
</html>