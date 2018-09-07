<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
班级编号:${sl.classId}<br>
班级名称:${sl.className}
<table border="1">
    <tr>
        <td>姓名</td>
        <td>年龄</td>
        <td>生日</td>
        <td>爱好</td>
    </tr>
    <c:forEach items="${sl.list}" var="l">
        <tr>
            <td>${l.name}</td>
            <td>${l.age}</td>
            <td><f:formatDate value="${l.birth}" pattern="yyyy-MM-dd"/></td>
            <td>
                <c:forEach items="${l.fav}" var="s">
                    <c:if test="${s==1}">唱歌</c:if>
                    <c:if test="${s==2}">篮球</c:if>
                    <c:if test="${s==3}">游戏</c:if>
                </c:forEach>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
