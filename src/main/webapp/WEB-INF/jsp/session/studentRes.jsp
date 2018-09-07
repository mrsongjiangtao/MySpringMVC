<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
requestScope:${requestScope.student}<br>
sessionScope:${sessionScope.student.name}<br>
student:${student.name}<br>
studentClass:${student}
</body>
</html>
