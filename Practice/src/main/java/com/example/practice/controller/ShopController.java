package com.example.practice.controller;

import com.example.practice.model.News;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ShopController", value = "/ShopController")
public class ShopController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {

        } else {
            switch (action) {
                case "HOME":
                    List<News> list = new ArrayList<>();
                    News news1 = new News("https://icdn.24h.com.vn/upload/4-2023/images/2023-11-12/455x303/3-495-1699788272-200-width740height495.jpg", "alo1234", "alo1", "son");
                    News news2 = new News("https://icdn.24h.com.vn/upload/4-2023/images/2023-11-10/455x303/10-495-1699626526-961-width740height495.jpg", "alo5678", "alo2", "son");
                    News news3 = new News("https://icdn.24h.com.vn/upload/4-2023/images/2023-11-10/455x303/7-495-1699552004-134-width740height495.jpg", "alo910", "alo3", "son");
                    list.add(news1);
                    list.add(news2);
                    list.add(news3);
                    request.setAttribute("list", list);
                    request.setAttribute("action", "home");
                    request.getRequestDispatcher("/").forward(request, response);
                    break;
                case "PRODUCT":
                    request.setAttribute("action", "product");
                    request.getRequestDispatcher("/WEB-INF/views/product.jsp").forward(request, response);
                    break;
                case "ABOUT":
                    request.setAttribute("action", "about");
                    request.getRequestDispatcher("/WEB-INF/views/about.jsp").forward(request, response);
                    break;
                case "PROFILE":
                    request.setAttribute("action", "profile");
                    request.getRequestDispatcher("/WEB-INF/views/profile.jsp").forward(request, response);
                    break;
                case "CART":
                    request.setAttribute("action", "cart");
                    request.getRequestDispatcher("/WEB-INF/views/cart.jsp").forward(request, response);
                    break;
                case "DICTIONARY":
                    request.setAttribute("action", "dictionary");
                    request.getRequestDispatcher("/WEB-INF/views/dictionary.jsp").forward(request, response);
                    break;
            }


        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}