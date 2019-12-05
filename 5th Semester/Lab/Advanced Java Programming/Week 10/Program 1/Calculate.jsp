<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculate</title>
</head>
<body>

  <%@ page errorPage="Receive.jsp" %>
 
  <%
    int amount = Integer.parseInt(request.getParameter("t1"));   
  
  	if(amount < 0) {
  		throw new Exception("Amount cannot be less than zero!!!");
  	}
  %>
 
    <h3>Amount deposited.</h3>.

</body>
</html>