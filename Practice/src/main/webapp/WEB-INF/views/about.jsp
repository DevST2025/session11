<%--
  Created by IntelliJ IDEA.
  User: nhi
  Date: 15/11/2023
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <jsp:include page="//WEB-INF/assets/navbar.jsp"></jsp:include>
    <h1>About Us</h1>
    <h3>Upload File</h3>
    <form action="/UploadController" method="post" enctype="multipart/form-data">
        <label for="images">Images:</label>
        <input type="file" id="images" name="images" multiple><br><br>
        <label for="avatar">Avatar:</label>
        <input type="file" id="avatar" name="avatar"><br><br>
        <input type="submit" name="action" value="UPLOAD">
    </form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
