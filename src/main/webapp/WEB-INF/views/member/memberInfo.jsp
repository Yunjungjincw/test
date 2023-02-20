<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>memberInfo.jsp</h3>
	<hr>
		<table border="1">
			<tr>
				<td>ID</td>
				<td>${member.id}</td>
			</tr>
			<tr>
				<td>pw</td>
				<td>${member.passwd}</td>
			</tr>
			<tr>
				<td>name</td>
				<td>${member.name}</td>
			</tr>
			<tr>
				<td>gender</td>
				<td>${member.gender}"</td>
			</tr>
			<tr>
				<td>가입일</td>
				<td>${member.regdate}</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<a href="<%=request.getContextPath()%>/member/update?memberid=${member.id}">정보 수정</a>
					<a href="<%=request.getContextPath()%>/member/delete?memberid=${member.id}">삭제하기</a>
				</td>
			</tr>
		</table>
</body>
</html>