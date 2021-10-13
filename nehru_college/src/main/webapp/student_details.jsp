<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 table{
     border:1px solid black;
     margin-left:auto;
     margin-right:auto;
     border-collapse: collapse;
   }
   tr,td,th{
     border:0.5px solid blue;
   }

</style>
</head>
<body>
<table>
	<tr>
		<th>sl.no</th>
		<th>Name</th>
		<th>Mark Scored</th>
	</tr>
<c:forEach items="${foundStudent}" var="each">
	<tr>
		<td>${each.id}</td>
		<td>${each.name}</td>
	<c:if test="${each.markScored<80}">
		<td style="color: #ff0000">${each.markScored}</td>
	</c:if>
	<c:if test="${each.markScored>=80}">
		<td style="color: #00ff00">${each.markScored}</td>
	</c:if>
	</tr>
</c:forEach>
</table>
<hr>
<table>
	<tr>
		<th>sl.no</th>
		<th>Name</th>
		<th>Mark Scored</th>
	</tr>
<c:forEach var="n"  begin="0"  end="${foundStudent.size()}" step="1">
	<tr>
		<td>${foundStudent[n].id}</td>
		<td>${foundStudent[n].name}</td>
	<c:if test="${foundStudent[n].markScored<80}">
		<td style="color: #ff0000">${foundStudent[n].markScored}</td>
	</c:if>
	<c:if test="${foundStudent[n].markScored>=80}">
		<td style="color: #00ff00">${foundStudent[n].markScored}</td>
	</c:if>
	</tr>
</c:forEach>
</table>
</body>
</html>