<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/26 0026
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- /springmvc-upload  -->

<form action="/springmvc-upload/upload" method="post" enctype="multipart/form-data">
    请输入ip地址:
    <input type="text" name="iphost"> <br/><br/>

    请输入端口号:
    <input type="text" name="port"> <br/><br/>


    <input type="file" name="file" /> <br/><br/>
    <input type="submit" value="提交上传" />
</form>


<!--

/springmvc-upload

-->

<form action="/springmvc-upload/lai">
   <input type="hidden" name="shuru" value="首次上线">

    <input type="submit" value="点击去聊天室" />


</form>






<%--
<a href="/upload">点击去上传</a>--%>
</body>
</html>
