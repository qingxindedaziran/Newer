<%--
  Created by IntelliJ IDEA.
  User: Live
  Date: 2019-05-13
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%--指令有三种：page include taglib指令--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>第一个JSP页面</title>
</head>
<body>
<h1 align="center">欢迎！</h1>
<% java.util.Date now = new java.util.Date(); out.println(now);%>


</body>
</html>
