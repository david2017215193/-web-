<%--
  Created by IntelliJ IDEA.
  User: 小胖狗wy
  Date: 2018/3/9
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
${msg}
    <form style="text-align:center; margin-top:200px; " action="LoginServlet"  method="post">
        用户名：<input type="text" name="id"/><br/>
        密码：<input type="password" name="password"/><br/>
        <input type="submit" name="登陆" value="登陆"/><br/>
    </form>
</body>
</html>
