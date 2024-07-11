<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <form:form action="/spct/add" method="post" modelAttribute="spct">
        <label>Ma san pham chi tiet</label>
        <form:input path="maSPCT" cssClass="form-control"/>
        <form:errors path="maSPCT" cssClass="text text-danger"/><br>
        <label>Kich thuoc</label>
        <form:select path="idKichThuoc" cssClass="form-control">
            <form:options items="${kichThuoc}" itemLabel="ten"/>
        </form:select>
        <form:errors path="idKichThuoc" cssClass="text text-danger"/><br>
        <label>Mau sac</label>
        <form:select path="idMauSac" cssClass="form-control">
            <form:options items="${mauSac}" itemLabel="ten"/>
        </form:select>
        <form:errors path="idMauSac" cssClass="text text-danger"/><br>
        <label>Ten san pham</label>
        <form:select path="idSanPham" cssClass="form-control">
            <form:options items="${sanPham}" itemLabel="ten"/>
        </form:select>
        <form:errors path="idSanPham" cssClass="text text-danger"/><br>
        <label>So luong</label>
        <form:input path="soLuong" cssClass="form-control"/>
        <form:errors path="soLuong" cssClass="text text-danger"/><br>
        <label>Don gia</label>
        <form:input path="donGia" cssClass="form-control"/>
        <form:errors path="donGia" cssClass="text text-danger"/><br>
        <label>Trang thai</label>
        <form:radiobuttons path="trangThai" items="${tt}" delimiter=" "/>
        <form:errors path="trangThai" cssClass="text text-danger"/><br>
        <br>
        <button type="submit" class="btn btn-success">Add</button>
    </form:form>
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Id</th>
                <th>Ma san pham chi tiet</th>
                <th>Kich thuoc</th>
                <th>Mau sac</th>
                <th>Ten san pham</th>
                <th>So luong</th>
                <th>Don gia</th>
                <th>Trang thai</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="spct">
                <tr>
                    <td>${spct.id}</td>
                    <td>${spct.maSPCT}</td>
                    <td>${spct.idKichThuoc.ten}</td>
                    <td>${spct.idMauSac.ten}</td>
                    <td>${spct.idSanPham.ten}</td>
                    <td>${spct.soLuong}</td>
                    <td>${spct.donGia}</td>
                    <td>${spct.trangThai ? "Con hang" :"Het hang"}</td>
                    <td>
                        <a href="/spct/delete/${spct.id}" class="btn btn-danger">Delete</a>
                        <a href="/spct/detail/${spct.id}" class="btn btn-info">Detail</a>
                        <a href="/spct/edit/${spct.id}" class="btn btn-warning">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <c:forEach begin="1" end="${totalPages}" var="page">
                <li class="page-item <c:if test="${page eq currentPage}">active</c:if>">
                    <a class="page-link" href="/spct/form?page=${page}">${page}</a>
                </li>
            </c:forEach>
        </ul>
    </nav>
</body>
</html>