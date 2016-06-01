<%--
  Created by IntelliJ IDEA.
  User: xiaotaot
  Date: 06/01/2016
  Time: 01:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Test!</title>
</head>
<body>
    <h1>This is a view test.</h1>
    <div>
        <p>Username from request: ${requestScope.username}</p>
        <p>Username from session: ${sessionScope.username}</p>
        <p>DateTime: ${requestScope.time}</p>
    </div>
</body>
</html>
