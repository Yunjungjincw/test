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
${member }
	<h3>회원정보 변경 ModiMemberForm</h3>
	<hr>
	<form:form id="ModiMemberFrm" ModelAttribute="UpdateMember" 
	method="post" action="<%=request.getContextPath()%>/member/update">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><form:input path="id" value="${member.id}"/></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><form:password path="passwd"/></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><form:input path="gender" value="${member.gender}"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="확인">
				<input type="reset" value="취소">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>