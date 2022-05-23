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
<div class="container">
    <form class="form-signup" method="post" action="<c:url value="${pageContext.request.contextPath}/student/findStudent"/>">
        <h2 class="form-signiup-heading">Введите id студента</h2>
        <p>
            <label for="id">Id</label>
            <input type="number" id="id" name="id" class="form-control" placeholder="id" required>
        </p>
        <button class="btn btn-lg btn-primary btn-block" type="submit" >Sign up</button>
    </form>
</div>
</body>
</html>
