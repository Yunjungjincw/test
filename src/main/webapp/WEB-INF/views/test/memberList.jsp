<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>memberList.jsp</h3>
	<h4>id/비번/거주지/성별</h4>
	
	
	<c:forEach items="${list}" var="item">
		${item.id}/${item.passwd}/${item.city}/${item.gender} <br>
	</c:forEach>
	
</body>
</html>