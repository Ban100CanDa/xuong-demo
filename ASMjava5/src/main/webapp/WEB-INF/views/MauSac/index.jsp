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
    <form:form action="/mau-sac/add" method="post" modelAttribute="ms">
        <label>Ten</label>
        <form:input path="ten" cssClass="form-control"/>
        <form:errors path="ten" cssClass="text text-danger"/>
        <br>
        <label>Ma</label>
        <form:input path="ma" cssClass="form-control"/>
        <form:errors path="ma" cssClass="text text-danger"/>
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
                <th>Ma mau sac</th>
                <th>Ten mau sac</th>
                <th>Trang thai</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="ms">
                <tr>
                    <td>${ms.id}</td>
                    <td>${ms.ma}</td>
                    <td>${ms.ten}</td>
                    <td>${ms.trangThai ? "Active" : "Inactive"}</td>
                    <td>
                        <a class="btn btn-danger" href="/mau-sac/delete/${ms.id}">Xoa</a>
                        <a class="btn btn-info" href="/mau-sac/detail/${ms.id}">Detail</a>
                        <a class="btn btn-warning" href="/mau-sac/update/${ms.id}">Edit</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <c:forEach begin="1" end="${totalPages}" var="page">
                <li class="page-item <c:if test="${page eq currentPage}">active</c:if>">
                    <a class="page-link" href="/mau-sac/form?page=${page}">${page}</a>
                </li>
            </c:forEach>
        </ul>
    </nav>
</body>
</html>