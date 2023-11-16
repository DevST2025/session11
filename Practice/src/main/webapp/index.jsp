<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<c:if test="${action==null}">
    <%
        response.sendRedirect("/ShopController?action=HOME");
    %>

</c:if>
<!DOCTYPE html>
<html>
<head>
    <title>THS Shop</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <jsp:include page="/WEB-INF/assets/navbar.jsp"></jsp:include>
<h1>Home Page</h1>

<h1>NEWS</h1>
<div class="row row-cols-1 row-cols-md-3 g-4">
    <c:forEach items="${list}" var="news">
        <div class="col">
            <div class="card h-100">
                <img src="${news.imageUrl}" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${news.title}</h5>
                    <p class="card-text">${news.content}</p>
                    <p class="card-text">${news.author}</p>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>