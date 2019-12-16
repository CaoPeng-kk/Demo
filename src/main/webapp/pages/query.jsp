<%--
  Created by IntelliJ IDEA.
  User: shinelon
  Date: 2019/12/5
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--用户信息<br>
    <c:forEach items="${userList}" var="user">
        ${user.id}&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.name}&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.sex}<br>
    </c:forEach>--%>
<form action="query" method="post">
    <input type="text" name="username"/><br>
    <input type="submit" value="查询">

</form>
</body>
</html>
