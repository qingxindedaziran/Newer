<%--
  Created by IntelliJ IDEA.
  User: Live
  Date: 2019-05-13
  Time: 21:23
  To change this template use File | Settings | File Templates.
--%>
   <%--JSP 指令--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table 表格 Color</title>
</head>
<body>
   <%--JSP 声明--%>
 <%! private String color1="EBEBEB"; private  String color2="F8F8F8";%>
   <%--Table 表格--%>
    <%--JSP 表达式--%>
<table align="center"  style="border-collapse: collapse" border="1px solid black" >
    <% for( int i=11; i<16;i++){
    String color="";
    if(i%2==0){
        color=color1;
    }else {
        color=color2;
    }%>
    <tr bgcolor="<%=color%>"><td>姓名<%=i%></td><td><%=i%></td></tr>
    <%}%>
    <%--<%!-- sf-->--%>
    <%="chentao".length()%>
    <%="chentao"+123%>
    <%=new java.util.Date()%>
    <%=this%>

<%! int x=0;%> <% int y=0;%>
    <%=x++%>,<%=y++%>
    <%! int anInt; int method(){return anInt++;}%>
    <%=anInt%>
    <% int anInt= method(); int any; %>
    <%=anInt%>
    <%--<%=any%>--%>
    <%=method()%>
    <%--<%@page%>--%>
    <%--<%! private int a=0;%>--%>
    <%--<%="chen".length() %>--%>
    <%--<%@page import="java.util.*,java.io.*" %>--%>
    <%--<%@page import="UserNumber" %>--%>


</table>

</body>
</html>
