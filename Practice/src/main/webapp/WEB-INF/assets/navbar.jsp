<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">THS</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link ${action=='home'?'active':''}" aria-current="page" href="<%=request.getContextPath()%>/ShopController?action=HOME">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link ${action=='product'?'active':''}" aria-current="page" href="<%=request.getContextPath()%>/ShopController?action=PRODUCT">Product</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link ${action=='about'?'active':''}" href="<%=request.getContextPath()%>/ShopController?action=ABOUT">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link ${action=='profile'?'active':''}" href="<%=request.getContextPath()%>/ShopController?action=PROFILE">Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link ${action=='cart'?'active':''}" href="<%=request.getContextPath()%>/ShopController?action=CART">Cart</a>
                </li>
                <li class="nav-item">

                    <a class="nav-link ${action=='dictionary'?'active':''}" href="<%=request.getContextPath()%>/ShopController?action=DICTIONARY">Dictionary</a>
                </li>
            </ul>
        </div>
<%--        <c:choose>--%>
<%--            <c:when test="${sessionScope.containsKey('user_login')}">--%>

<%--            </c:when>--%>
<%--            <c:otherwise>--%>

<%--            </c:otherwise>--%>
<%--        </c:choose>--%>
<%--        <c:choose>--%>
<%--            <c:when test="${!sessionScope.containsKey('user_login')}">--%>
<%--                <div>--%>
<%--                    <a href="<%=request.getContextPath()%>/AuthController?action=REGISTER" class="btn btn-primary">Đăng ký</a>--%>
<%--                    <a href="<%=request.getContextPath()%>/AuthController?action=LOGIN" class="btn btn-primary">Đăng nhập</a>--%>
<%--                </div>--%>
<%--            </c:when>--%>
<%--            <c:otherwise>--%>
<%--                <div  class="d-flex gap-2 align-items-center">--%>
<%--                    <img width="50" height="50" style="border-radius: 50%;object-fit: cover" src="${sessionScope.get("user_login").avatarUrl}" alt="">--%>
<%--                    <p class="m-0">${sessionScope.get("user_login").fullName}</p>--%>
<%--                    <a href="<%=request.getContextPath()%>/AuthController?action=LOGOUT" class="btn btn-primary">Đăng xuất</a>--%>
<%--                </div>--%>
<%--            </c:otherwise>--%>
<%--        </c:choose>--%>
    </div>
</nav>
