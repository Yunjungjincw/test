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
${addMember}
<%-- 컨트롤러로부터 
Member member
model.addAttribute("member",member); --%>
  <h3>memberInfo.jsp</h3>
  모델의 값 :${member}
 *아이디:${member.id}<br/> 
 *비밀번호:${member.passwd}<br/> 
 *거주지:${member.city}<br/> 
 *성별:${member.gender}<br/> 
 <c:forEach items="${member.hobby}" var="item" varStatus="status">
 *${status.count}취미:${item}<br/> 
 </c:forEach>
 *addMember:${member.addMember}<br/> 
 
 
 
 <pre>
 *forEach태그에서 반복의 상태를 나타내는 속성 varStatus="status"
 </pre>
 
 
 <table border="1">
 <thead>
 	<tr>
 		<th>모델명</th><th>index</th><th>count</th><th>current</th><th>isFirst?</th><th>islast</th>
	</tr> 
 </thead>
 <tbody>
 	 <c:forEach items="${member.hobby}" var="item" varStatus="status">
	 	<tr>
	 		<td>${item}</td>
	 		<td>${status.index}</td>
	 		<td>${status.count}</td>
	 		<td>${status.current}</td>
	 		<td>${status.first}</td>
	 		<td>${status.last}</td>
	 	</tr>
 	</c:forEach>
 </tbody>
 </table>
 

<hr>
<hr>
<hr>
   
 
 
 
</body>
</html>


