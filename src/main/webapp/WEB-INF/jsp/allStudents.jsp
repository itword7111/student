<%--@elvariable id="user" type="com.example.forum.entity.User"--%>
<%--@elvariable id="roles" type="com.example.forum.model.Role.values()"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Login Customer</title>
</head>
<body>
<script src="<c:url value="/js/jquery-1.10.2.min.js" />" type="text/javascript"></script>
<script>function setSelectedRole(){
    document.getElementById("userRole").value=document.getElementById("Role").value;
}</script>
<div id="page">
    <%--@elvariable id="students" type="java.util.List<com.example.student.entity.Student>"--%>
    <c:forEach var="student" items="${students}">
        <div id="content" class="content">

            <a>Имя ${student.getFirstName()}</a>
            <a>Фамилия ${student.getLastName()}</a>
            <a>Отчество ${student.getPatronymic()}</a>
            <a>Группа ${student.getGroup()}</a>
            <a>Дата рождения ${student.getDate()}</a>

        </div>
        <a></a>
    </c:forEach>
</div>
</body>
</html>
