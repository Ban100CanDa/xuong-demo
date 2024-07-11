<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="container">

<form:form action="/nhan-vien/update" method="post" modelAttribute="fnv">
    <div class="mb-3">
        <label class="form-label">ID</label>
        <form:input path="id" class="form-control" readonly=""/>
        <form:errors path="id" cssClass="text-danger"/>
    </div>
    <div class="mb-3">
        <label class="form-label">Ten</label>
        <form:input path="ten" class="form-control"/>
        <form:errors path="ten" cssClass="text-danger"/>
    </div>
    <div class="mb-3">
        <label  class="form-label">Ma nhan vien</label>
        <form:input path="maNv"  class="form-control"/>
        <form:errors path="maNv" cssClass="text-danger"/>
    </div>
    <div class="mb-3">
        <label  class="form-label">Ten dang nhap</label>
        <form:input path="tenDangNhap"  class="form-control"/>
        <form:errors path="tenDangNhap" cssClass="text-danger"/>
    </div>
    <div class="mb-3">
        <label  class="form-label">Mat khau</label>
        <form:input path="matKhau"  class="form-control"/>
        <form:errors path="matKhau" cssClass="text-danger"/>
    </div>
    <div class="mb-3">
        <label for="trangThai" class="form-label">Trang thai</label>
        <form:radiobuttons path="trangThai" items="${tt}" id="trangThai" cssClass="form-check-input"/>
        <form:errors path="trangThai" cssClass="text-danger"/>
    </div>
    <button type="submit" class="btn btn-primary">Cap nhat</button>
</form:form>
</body>
</html>
