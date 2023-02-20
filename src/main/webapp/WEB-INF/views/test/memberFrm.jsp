<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Form Tag</title>
</head>
<body>
	<h3>회원가입</h3>
	<%--
<form:form modelAttribute="member" method="post" action="./reqMehtod12">	
폼의	method="post"는 컨트롤러에서 요청함수호출시 post방식으로 허용된 요청함수를 호출	 
폼의	action="./reqMehtod12"은  컨트롤러에서  매핑주소가 /reqMehtod12인  요청함수를 호출
폼의 modelAttribute="member"은 컨트롤러에서 호출되는 요청함수의 매개변수가 
    @ModelAttribute Member member 로 처리
    
폼의 action속성값이 없으면   해당문서의 창의 현재url을 기본으로 한다    
--%>
	<form:form modelAttribute="member" method="post" action="./reqMehtod12">
		<p>아이디~ : <form:input path="id"  name="id" value=""/> 
		<p>비밀번호 : <form:password path="passwd"/>
		<p>거주지 : <form:select path="city">
					<form:option value="서울시">서울시</form:option>
					<form:option value="경기도">경기도</form:option>
					<form:option value="인천시">인천시</form:option>
					<form:option value="충청도">충청도</form:option>
					<form:option value="전라도">전라도</form:option>
					<form:option value="경상도">경상도</form:option>
				</form:select>
 		<p>성별 : <form:radiobutton  path="gender"  value="남성"/>남성 
				<form:radiobutton   path="gender"  value="여성"/>여성
		<p>취미 : <form:checkbox  path="hobby" value="독서"/>독서
				<form:checkbox  path="hobby" value="운동"/>운동
				<form:checkbox  path="hobby" value="영화"/>영화
		<p><input type="submit" value="가입하기"/> 
			<input type="reset"  value="다시쓰기"/>
	</form:form>
</body>

<html>






