<%--
  Created by IntelliJ IDEA.
  User: mi
  Date: 2018/9/6
  Time: 11:03
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
pojoModelMapRes执行
${student.name}<br>
${student.age}<br>
<fmt:formatDate value="${student.birth}" pattern="yyyy-MM-dd"/>
<c:forEach items="${student.fav}" var="f">
    <c:if test="${f==1}">唱歌</c:if>
    <c:if test="${f==2}">篮球</c:if>
    <c:if test="${f==3}">游戏</c:if>
</c:forEach>
</body>
</html>
