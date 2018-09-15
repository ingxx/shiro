<%--
  Created by IntelliJ IDEA.
  User: wjk
  Date: 2018/9/15
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <shiro:hasPermission name="permission">
        <label>拥有permission权限</label>
    </shiro:hasPermission>

    <shiro:hasPermission name="test">
        <label>拥有test权限</label>
    </shiro:hasPermission>
</body>
</html>
