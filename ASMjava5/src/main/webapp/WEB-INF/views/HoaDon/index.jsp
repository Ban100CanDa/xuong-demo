<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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
    <form:form action="/hoa-don/add" method="post" modelAttribute="hd">
        <label>Id nhan vien</label>
        <form:select path="idNV" cssClass="form-control">
            <form:options items="${nhanVien}" itemLabel="ten"/>
        </form:select>
        <form:errors path="idNV" cssClass="text text-danger"/>
        <br>
        <label>Id khach hang</label>
        <form:select path="idKH" cssClass="form-control">
            <form:options items="${khachHang}" itemLabel="ten"/>
        </form:select>
        <form:errors path="idKH" cssClass="text text-danger"/>
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
                <th>Id nhan vien</th>
                <th>Id khach hang</th>
                <th>Ngay mua hang</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="hd">
                <tr>
                    <td>${hd.id}</td>
                    <td>${hd.idNV.ten}</td>
                    <td>${hd.idKH.ten}</td>
                    <td>${hd.ngayTao}</td>
                    <td>${hd.trangThai ? "Da thanh toan" : "Chua thanh toan"}</td>
                    <td>
                        <a class="btn btn-danger" href="/hoa-don/delete/${hd.id}">Xoa</a>
                        <a class="btn btn-info" href="/hoa-don/detail/${hd.id}">Detail</a>
                        <a class="btn btn-warning" href="/hoa-don/update/${hd.id}">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <c:forEach begin="1" end="${totalPages}" var="page">
                <li class="page-item <c:if test="${page eq currentPage}">active</c:if>">
                    <a class="page-link" href="/hoa-don/form?page=${page}">${page}</a>
                </li>
            </c:forEach>
        </ul>
    </nav>
</body>
</html>