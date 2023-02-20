<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${memberList}
	<h3>memberList.jsp</h3>
	<table border="1">
		<tr>
			<td>아이디</td>
			<td>비번</td>
			<td>이름</td>
			<td>성별</td>
			<td>가입일</td>
		</tr>
		<c:forEach items="${memberList}" var="item" varStatus="status">
		<tr>
			<td><a href="<%=request.getContextPath()%>/memberInfo?memberid=${item.id}">${item.id}</a></td>
			<td>${item.passwd}</td>
			<td>${item.name}</td>
			<td>${item.gender}</td>
			<td>${item.regdate}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>