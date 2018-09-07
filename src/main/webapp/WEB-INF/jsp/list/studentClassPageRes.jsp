<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<table border="1">
    <tr>
        <td>班级编号</td>
        <td>班级名称</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>生日</td>
        <td>爱好</td>
    </tr>
    <tr>
        <td>${student.sc.classId}</td>
        <td>${student.sc.className}</td>
        <td>${student.name}</td>
        <td>${student.age}</td>
        <td><f:formatDate value="${student.birth}" pattern="yyyy-MM-dd"/></td>
        <td>
            <c:forEach items="${student.fav}" var="s">
                <c:if test="${s==1}">唱歌</c:if>
                <c:if test="${s==2}">篮球</c:if>
                <c:if test="${s==3}">游戏</c:if>
            </c:forEach>
        </td>
    </tr>
</table>
</body>
</html>
