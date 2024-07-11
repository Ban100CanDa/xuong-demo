<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="container">
<form:form action="/khach-hang/add" method="post" modelAttribute="kh">
    <label>Ten</label>
    <form:input path="ten" cssClass="form-control"/>
    <form:errors path="ten" cssClass="text text-danger"/>
    <br>
    <label>So dien thoai</label>
    <form:input path="sdt" cssClass="form-control"/>
    <form:errors path="sdt" cssClass="text text-danger"/>
    <br>
    <label>Ma khach hang</label>
    <form:input path="maKh" cssClass="form-control"/>
    <form:errors path="maKh" cssClass="text text-danger"/>
    <br>
    <label>Trang thai</label>
    <form:radiobuttons path="trangThai" items="${tt}" delimiter=" "/>
    <br>
    <form:errors path="trangThai" cssClass="text text-danger"/>
    <br>
    <button type="submit" class="btn btn-success">Add</button>
</form:form>
<br>
<table class="table table-bordered">
    <thead>
    <tr>
        <th>ID</th>
        <th>Ten khach hang</th>
        <th>So dien thoai</th>
        <th>Ma khach hang</th>
        <th>Trang thai</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="kh">
        <tr>
            <td>${kh.id}</td>
            <td>${kh.ten}</td>
            <td>${kh.sdt}</td>
            <td>${kh.maKh}</td>
            <td>${kh.trangThai ? "Active" : "Inactive"}</td>
            <td>
                <a class="btn btn-danger" href="/khach-hang/delete/${kh.id}">Xoa</a>
                <a class="btn btn-info" href="/khach-hang/detail/${kh.id}">Detail</a>
                <a class="btn btn-warning" href="/khach-hang/edit/${kh.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<nav aria-label="Page navigation">
    <ul class="pagination">
        <c:forEach begin="1" end="${totalPages}" var="page">
            <li class="page-item <c:if test="${page eq currentPage}">active</c:if>">
                <a class="page-link" href="/khach-hang/form?page=${page}">${page}</a>
            </li>
        </c:forEach>
    </ul>
</nav>
</body>
</html>