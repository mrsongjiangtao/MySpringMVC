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
SessionScopeName:${sessionScope.name}
<form action="<%=basePath %>sessionController/singleParam" method="post" >
    姓名：<input type="text" name="name">
    <input type="submit" value="提交">
</form>
</body>
</html>
