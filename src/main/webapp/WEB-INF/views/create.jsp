<%--
  Created by IntelliJ IDEA.
  User: quan
  Date: 18/03/2022
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Form tạo mới sản phẩm</h1>
<form action="/products/create2" method="post">
    <input type="text" name="id" placeholder="Nhập mã sản phẩm">
    <input type="text" name="name2" placeholder="Nhập tên sản phẩm">
    <input type="text" name="price" placeholder="Nhập giá sản phẩm">
    <button>Tạo mới</button>
</form>
</body>
</html>
