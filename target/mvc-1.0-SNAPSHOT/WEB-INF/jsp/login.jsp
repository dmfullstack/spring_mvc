<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Yahoo!!</title>
</head>
<body>
<br>
My First JSP!!
<br>
Login is is ${name}!
<br>
Password is hush! ${password}!
<br>
<%--Below the scriplet (java) code is  executed--%>
<%
    System.out.println("my hui is large!");
    Date date = new Date();
%>
<div>Current date is (scriplet expression): <%=date%></div>

<form action="/spring-mvc/login" method="post">
    Enter your login: <input type="text" name="name"/>
    Enter your password: <input type="password" name="password"/>
    <button type="submit">submit!</button>
</form>

<br>
<p style="color: red">${error}</p>

</body>
</html>