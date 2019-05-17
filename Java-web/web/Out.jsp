<%--
  Created by IntelliJ IDEA.
  User: Live
  Date: 2019-05-17
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="index.jsp" %>
<%--<%@page import="java.util.*,java.io.PrintWriter" %>--%>
<html>
<head>
    <title>Out println()  write() print()  JspWriter的子类</title>
</head>
<body>
<% out.print("现在时间是："+ new java.util.Date()); %>
<% out.print("现在时间是："+ new java.util.Date()); %>
<%=out.isAutoFlush() %>
<% out.write("现在时间是："+ new java.util.Date());%>
<% out.write("现在时间是："+ new java.util.Date());%>
<% out.clear();%>
<% out.close();%>
<% out.flush();%>
<% out.println("现在时间是："+ new java.util.Date());%>
<% out.println("现在时间是："+ new java.util.Date());%>


</body>
</html>
