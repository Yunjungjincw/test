<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%-- Controller에 의해서 아래와 같이 Model을 받았다
 	  model.addAttribute("m1",Object타입 값);
 	  model.addAttribute("dname", dname);
 	  model.addAttribute("location", location); --%>
 <h3>resultView.jsp문서</h3>
 *m1:${m1}<br/>
 *m2:${m2}<br/>
 <%--*User정보:${userDTO}<br/>
 *이름:${MODELname}<br/>
 *이메일:${MODELemail}<br/>
 *나이:${MODELage}<br/>
 *성별:${MODELgender}<br/>
 *dname:${dname}<br/>
 *location:${location}<br/>
 --%>
 
 
 simpleMember : ${simpleMember}<br/>
</body>
</html>





