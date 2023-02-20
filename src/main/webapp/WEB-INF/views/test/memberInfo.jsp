<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 컨트롤러로부터 
Member member
model.addAttribute("member",member); --%>
  <h3>memberInfo.jsp</h3>
  모델의 값 :${member}
 *아이디:${member.id}<br/> 
 *비밀번호:${member.passwd}<br/> 
 *거주지:${member.passwd}<br/> 
 *성별:${member.gender}<br/> 
 *취미:${member.hobby}<br/> 
</body>
</html>








