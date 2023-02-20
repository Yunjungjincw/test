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
	<h3>회원정보 변경 ModiMemberForm</h3>
	<hr>
	<form:form modelAttribute="updateMember" method="post" action="./update">
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
				<td <form:input path="name" value="${member.name}"/>></td>
			</tr>
			<tr>
				<td>gender</td>
				<td <form:input path="gender" value="${member.gender}"/>></td>
			</tr>
			<tr>
				<td>가입일</td>
				<td>${member.regdate}</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<a href="<%=request.getContextPath()%>/member/update">수정하기</a>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>