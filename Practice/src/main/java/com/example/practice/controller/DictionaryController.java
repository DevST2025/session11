package com.example.practice.controller;

import com.example.practice.model.Dictionary;
import com.example.practice.service.IDictionaryService;
import com.example.practice.serviceimpl.DictionaryService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@MultipartConfig(
        maxFileSize = 50*1024*2024,
        maxRequestSize = 50*1024*2024,
        fileSizeThreshold = 50*1024*2024
)
@WebServlet(name = "DictionaryController", value = "/DictionaryController")
public class DictionaryController extends HttpServlet {
    private IDictionaryService dictionaryService = new DictionaryService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action!=null) {
            switch (action) {
                case "ADD":

                    // Lấy ra đối tượng ServletContext
                    String uploadPath = getServletContext().getRealPath("/uploads");
                    File file = new File(uploadPath);
                    if (!file.exists()) {
                        file.mkdirs();
                    }

                    Part part = request.getPart("img");
                    String nameFile = part.getSubmittedFileName();
                    part.write(uploadPath + File.separator + nameFile);

                    String img = nameFile;
                    String vocabulary =request.getParameter("vocabulary");
                    String desc =request.getParameter("description");
                    Dictionary dictionary = new Dictionary(img, vocabulary, desc);
                    boolean check = dictionaryService.save(dictionary);
                    if (check) {
                        request.getRequestDispatcher("/").forward(request, response);
                    }
                    break;
                case "SEARCH":
                    break;
            }
        }

    }
}