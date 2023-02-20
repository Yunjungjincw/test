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
${member1}
	<h3>회원정보 변경 ModiMemberForm</h3>
	<hr>
	<form id="ModiMemberFrm" method="post" action="<%=request.getContextPath()%>/member/update">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="id" value="${member1.id}" readonly/></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="passwd"/></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><input type="text" name="gender" value="${member1.gender}"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="확인">
				<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>