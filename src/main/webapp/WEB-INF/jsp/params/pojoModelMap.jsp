<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2018/9/6
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=basePath %>paramController/pojoModelMap" method="post" >
    姓名：<input type="text" name="name"><br />
    年龄：<input type="text" name="age"><br />
    生日：<input type="date" name="birth"><br />
    爱好：
    <input type="checkbox" name="fav" value="1">唱歌
    <input type="checkbox" name="fav" value="2">篮球
    <input type="checkbox" name="fav" value="3">游戏 <br/>

    <input type="submit" value="提交">
</form>
</body>
</html>

