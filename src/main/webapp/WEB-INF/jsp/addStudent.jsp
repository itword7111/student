<%--@elvariable id="user" type="com.example.forum.entity.User"--%>
<%--@elvariable id="roles" type="com.example.forum.model.Role.values()"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Создание Студента</title>
</head>
<body>
<script src="<c:url value="/js/jquery-1.10.2.min.js" />" type="text/javascript"></script>

<div class="container">
    <form class="form-signup" method="post" action="<c:url value="${pageContext.request.contextPath}/student/addStudent"/>">
        <h2 class="form-signiup-heading">Создание Студента</h2>
        <p>
            <label for="firstName">Имя</label>
            <input type="text" id="firstName" name="firstName" class="form-control" placeholder="firstName" required>
        </p>
        <p>
            <label for="lastName">Фамилия</label>
            <input type="text" id="lastName" name="lastName" class="form-control" placeholder="lastName" required>
        </p>
        <p>
            <label for="patronymic">Отчество</label>
            <input type="text" id="patronymic" name="patronymic" class="form-control" placeholder="patronymic" required>
        </p>
        <p>
            <label for="group">Группа</label>
            <input type="text" id="group" name="group" class="form-control" placeholder="group" required>
        </p>
        <p>
            <label for="date">Дата рождения</label>
            <input type="date" id="date" name="date" class="form-control" placeholder="date" required>
        </p>

        <button class="btn btn-lg btn-primary btn-block" type="submit" >Sign up</button>
    </form>
</div>
</body>
</html>
