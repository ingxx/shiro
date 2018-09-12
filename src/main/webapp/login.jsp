<%--
  Created by IntelliJ IDEA.
  User: wjk
  Date: 2018/9/11
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/shiro/checkLogin" method="post">
        <h1>登陆</h1>
        用户名:<input type="text" name="userName" id="userName"/>
        密码:<input type="password" name="passWord" id="passWord">
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
