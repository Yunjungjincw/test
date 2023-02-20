<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원목록출력</title>
</head>
<body>
 <%-- EmpController로 부터  모델받았다 
      List<EmpDTO> emplist ;
	  model.addAttribute("emplist",emplist);--%>
 <h3>empList.jsp</h3>
 <br/>
 
 <ol>
 <c:forEach var="list" items="${emplist}">
  <li>${list}</li>
 </c:forEach>
 </ol> 
 
</body>
</html>





