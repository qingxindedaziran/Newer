<%@ page import="java.util.TimerTask" %><%--
  Created by IntelliJ IDEA.
  User: Live
  Date: 2019-05-13
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>十个数</title>
</head>
<body>
    <% int sum=0; for(int i=0;i<=10; i++){
        sum+=i;
        out.println(i+" ");


    }
        out.println("<br> 这十个数的和为： "+ sum);
    %>
    <%--<% java.util.Timer timer= new java.util.Timer();--%>

        <%--timer.schedule(new TimerTask() {--%>
            <%--@Override--%>
            <%--public void run() {--%>
                <%--java.util.Date now = new java.util.Date();--%>
                <%--out.print("<h1>");--%>
                <%--out.print(now);--%>
                <%--out.print("</h1>");--%>
            <%--}--%>
        <%--},1000);--%>
    <%--%>--%>

</body>
</html>
