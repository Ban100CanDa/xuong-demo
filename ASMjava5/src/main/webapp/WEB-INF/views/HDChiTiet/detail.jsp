<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous"
</head>
<body class="container">
    <label class="form-label">Id</label>
    <input class="form-control" type="text" value="${detail.id}" readonly ><br>
    <label class="form-label">Id hoa don</label>
    <input class="form-control" type="text" value="${detail.idHoaDon.idKH.ten}"readonly><br>
    <label class="form-label">Ten san pham</label>
    <input class="form-control" type="text" value="${detail.idSpct.idSanPham.ten}"readonly><br>
    <label class="form-label">So luong</label>
    <input class="form-control" type="text" value="${detail.soLuong}"readonly><br>
    <label class="form-label">Don gia</label>
    <input class="form-control" type="text" value="${detail.donGia}"readonly><br>
    <label class="form-label">Trang thai</label>
    <input class="form-control" type="text" value="${detail.trangThai}"readonly><br>
</body>
</html>