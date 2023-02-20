<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
/views/member/main.jsp
	<h3>${greeting}</h3>
	<hr>
	<ul>
		<li><a href="member/add">회원가입 상대</a></li>
		<li><a href="<%=request.getContextPath()%>/member/add">회원가입 절대</a></li>
	</ul>
</body>
</html>