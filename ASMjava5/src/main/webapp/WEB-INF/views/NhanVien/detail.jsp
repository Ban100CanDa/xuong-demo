<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <title>Document</title>
</head>
<body class="container">
    <div class="mb-3">
        <label class="form-label">Id</label>
        <input type="text" class="form-control" value="${nhanVien.id}" readonly>
    </div>
    <div  class="mb-3">
        <label>Ten</label>
        <input type="text" class="form-control" value="${nhanVien.ten}" readonly><br>
    </div>
    <div class="mb-3">
        <label>Ma nhan vien</label>
        <input type="text" class="form-control" value="${nhanVien.maNv}" readonly><br>
    </div>
    <div class="mb-3">
        <label>Ten dang nhap</label>
        <input type="text" class="form-control" value="${nhanVien.tenDangNhap}" readonly><br>
    </div>
    <div class="mb-3">
        <label>Mat khau</label>
        <input type="text" class="form-control" value="${nhanVien.matKhau}" readonly><br>
    </div>
    <div class="mb-3">
        <label>Trang thai</label>
        <input type="text" class="form-control" value="${nhanVien.trangThai}" readonly><br>
    </div>

</body>
</html>