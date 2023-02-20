<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
 <h3>userFrm.jsp</h3>
 <!-- /reqMethod9?name=hongGD&email=h@test.com&age=25&gender=f -->
 <!-- /reqMethod9? -->
 <form name="userFrm" id="userFrm" 
 method="post" 
 action="<%=request.getContextPath()%>/reqMethod9">
 	*이름:<input type="text" name="name" id="name" required="required"/><br/>
 	*이메일:<input type="text" name="email" id="email" required="required"/><br/>
 	*나이:<input type="text" name="age" id="age" required="required"/><br/>
 	*성별:
 	<input type="radio" name="gender" id="gender" value="f" checked="checked"/>여성
 	<input type="radio" name="gender" id="gender" value="m"/>남성<br/><br/>
 	*취미: <!-- hobby=baseball&hobby=movie&hobby=sleep -->
 	<input type="checkbox" name="hobby"  value="baseball" checked="checked"/>야구
 	<input type="checkbox" name="hobby"  value="movie" />영화감상
 	<input type="checkbox" name="hobby"  value="sport" />운동
 	<input type="checkbox" name="hobby"  value="sleep" />명상을 가장한 수면
 	<br/><br/>
 	<input type="submit" value="확인"/>
 	<input type="reset" value="취소"/>
 </form>
</body>
</html>





