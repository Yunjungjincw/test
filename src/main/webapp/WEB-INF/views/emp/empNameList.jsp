<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원명단출력</title>
</head>
<body>
 <%-- EmpController로 부터  모델받았다 
      List<String> nameList
	  model.addAttribute("nameList", nameList);--%>
 <h3>empNameList.jsp</h3>
 ${nameList}<br/>
 
 <ol>
 <c:forEach var="list" items="${nameList}">
  <li>${list}</li>
 </c:forEach>
 </ol>
 
</body>
</html>





