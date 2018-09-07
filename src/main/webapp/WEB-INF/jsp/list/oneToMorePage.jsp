<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2018/9/6
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<body>
<form action="<%=basePath %>studentListController/oneToMore" method="post" >
    班级编号：<input type="text" name="classId"><br>
    班级名称：<input type="text" name="className"><br><br>
    姓名：<input type="text" name="list[0].name"><br />
    年龄：<input type="text" name="list[0].age"><br />
    生日：<input type="date" name="list[0].birth"><br />
    爱好：
    <input type="checkbox" name="list[0].fav" value="1">唱歌
    <input type="checkbox" name="list[0].fav" value="2">篮球
    <input type="checkbox" name="list[0].fav" value="3">游戏 <br/><br><br>
    姓名：<input type="text" name="list[1].name"><br />
    年龄：<input type="text" name="list[1].age"><br />
    生日：<input type="date" name="list[1].birth"><br />
    爱好：
    <input type="checkbox" name="list[1].fav" value="1">唱歌
    <input type="checkbox" name="list[1].fav" value="2">篮球
    <input type="checkbox" name="list[1].fav" value="3">游戏 <br/>
    <input type="submit" value="提交">
</form>
</body>
</html>

