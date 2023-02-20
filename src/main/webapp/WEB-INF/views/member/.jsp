<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>memberInfo.jsp</h3>
	<hr>
	${member}
	<form>
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
			<td>${member.gender}</td>
		</tr>
		<tr>
			<td>가입일</td>
			<td>${member.regdate}</td>
		</tr>
		<tr>
			<td>
			<a href="<%=request.getContextPath()%>/member/update"></a>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>