<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/26 0026
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
你发送的内容为:
<br/>

<p>${shuru}</p>

<br/>
<span style="color: black;font-size:30px">你接收的内容为:</span>
<br/>

<p><span style="color: red;font-size: 30px">${fanhui}</span></p>


<form action="/liaotian">
    请输入ip地址:
    <input type="text" name="iphost" value="10.167.194.172" readonly> <br/><br/>

    请输入文字:
    <br/>

    <textarea name="shuru" cols="30" rows="10"></textarea><br/><br/>
    <input type="submit" value="发送文字" />


</form>

</body>
</html>
