<%--
  Created by IntelliJ IDEA.
  User: nhi
  Date: 15/11/2023
  Time: 15:43
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
<h1>Add new vocabulary</h1>
<div class="container-fluid">
  <form action="/DictionaryController" method="POST" enctype="multipart/form-data">
    <div class="mb-3">
      <label for="img" class="form-label">Image:</label>
      <input type="file" class="form-control" id="img" name="img">
    </div>
    <div class="mb-3">
      <label for="vocabulary" class="form-label">Vocabulary:</label>
      <input type="text" class="form-control" id="vocabulary" name="vocabulary">
    </div>
    <div class="mb-3">
      <label for="description" class="form-label">Description:</label>
      <textarea class="form-control" id="description" rows="3" name="description"></textarea>
    </div>
    <input type="submit" name="action" value="ADD">
  </form>
</div>





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

