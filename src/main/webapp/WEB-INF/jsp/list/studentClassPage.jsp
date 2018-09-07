<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<body>
<form action="<%=basePath %>studentListController/studentClass" method="post" >
    姓名：<input type="text" name="name"><br />
    年龄：<input type="text" name="age"><br />
    生日：<input type="date" name="birth"><br />
    爱好：
    <input type="checkbox" name="fav" value="1">唱歌
    <input type="checkbox" name="fav" value="2">篮球
    <input type="checkbox" name="fav" value="3">游戏 <br/>
    班级编号：<input type="text" name="sc.classId"><br>
    班级名称：<input type="text" name="sc.className"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
