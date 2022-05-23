<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<jsp:directive.page contentType="text/html;charset=UTF-8"/>

<head>
    <link href="<c:url value="/css/style.css" />" rel="stylesheet" type="text/css">
    <title>Forum</title>
</head>
<body>
<script language="JavaScript" src="<c:url value="/js/jquery-1.10.2.min.js" />" type="text/javascript"></script>
<script>

</script>


<%--@elvariable id="posts" type="java.util.List<Post>"--%>
    <div id="page">
        <p><a href=${pageContext.request.contextPath}/student/addStudent>Создать студента</a></p>
        <p><a href=${pageContext.request.contextPath}/student/findStudent>Найти студента по id</a></p>
        <p><a href=${pageContext.request.contextPath}/student/findAllStudents>Найти всех студентов по id</a></p>
    </div>
</body>
</html>