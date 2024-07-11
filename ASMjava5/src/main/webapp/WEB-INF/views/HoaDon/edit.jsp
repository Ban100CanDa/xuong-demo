<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="container">

<form:form action="/hoa-don/update" method="post" modelAttribute="fhd">
    <div class="mb-3">
        <label class="form-label">Id</label>
        <form:input path="id" cssClass="form-control" readonly="true"/>
        <form:errors path="id" cssClass="text-danger"/>
    </div>
    <div class="mb-3">
        <label class="form-label">Ten nhan vien</label>
        <form:select path="idNV" cssClass="form-control">
            <form:options items="${nhanVien}" itemLabel="ten"/>
        </form:select>
        <form:errors path="idNV" cssClass="text text-danger"/>
    </div>
    <div class="mb-3">
        <label  class="form-label">Ten khach hang</label>
        <form:select path="idKH" cssClass="form-control">
            <form:options items="${khachHang}" itemLabel="ten"/>
        </form:select>
        <form:errors path="idKH" cssClass="text-danger"/>
    </div>
    <div class="mb-3">
        <label class="form-label">Ngay Mua hang</label>
        <form:input path="ngayTao" cssClass="form-control" readonly="true"/>
        <form:errors path="ngayTao" cssClass="text-danger"/>
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
