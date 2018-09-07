<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2018/9/6
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
testMapRes执行成功
${name}<br>
${age}<br>
<fmt:formatDate value="${birth}" pattern="yyyy-MM-dd"/> <br>
<c:forEach items="${fav}" var="f">
    <c:if test="${f==1}">唱歌</c:if>
    <c:if test="${f==2}">篮球</c:if>
    <c:if test="${f==3}">游戏</c:if>
</c:forEach>
</body>
</html>
