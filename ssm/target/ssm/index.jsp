<%--
  Created by IntelliJ IDEA.
  User: guorui
  Date: 2019/8/15
  Time: 下午4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/account/findAll">测试</a>

    <form action="/account/saveAccount" method="post">
        姓名:<input type="text" name="name"> <br/>
        金额:<input type="text" name="money"> <br/>

        <input type="submit" value="submit">
    </form>
</body>
</html>
