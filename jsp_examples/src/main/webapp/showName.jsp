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
<h2>List of Names</h2>
<%=session.isNew() %>
<%=session.getId() %>
<%session.invalidate();%>

<a href="fourth.jsp">Continue</a>
</body>
</html>