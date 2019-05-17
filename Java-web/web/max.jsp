<%--
  Created by IntelliJ IDEA.
  User: Live
  Date: 2019-05-13
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! private int a=30;private int b=34; public int max(int number1,int number2) {
    int max=0;
    return number1>number2?number1:number2;
};%>
<html>
<head>
    <title>求最大值</title>
</head>
<body>
<%=a%>和<%=b%>中最大的数是<%=max(a,b)%>
<% for (int i=0;i<a;i++){
    out.print("<li><ul>");
    out.print(i);
    out.print("</ul></li>");
}%>


</body>
</html>
