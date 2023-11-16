package com.example.practice.controller;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@MultipartConfig(
        maxFileSize = 50*1024*2024,
        maxRequestSize = 50*1024*2024,
        fileSizeThreshold = 50*1024*2024
)
@WebServlet(name = "UploadController", value = "/UploadController")
public class UploadController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action!=null && action.equals("UPLOAD")) {
            // Lấy ra đối tượng ServletContext
            String uploadPath = getServletContext().getRealPath("/uploads");
            File file = new File(uploadPath);
            if (!file.exists()) {
                file.mkdirs();
            }

            List<String> filenames = new ArrayList<>();
            // lay ra danh sach file upload
            Collection<Part> listFile = request.getParts();
            for (Part p : listFile) {
                if (p.getName().equals("image")) {
                    // upload image
                    String nameFile = p.getSubmittedFileName();
                    p.write(uploadPath + File.separator + nameFile);
                    filenames.add(nameFile);
                } else if (p.getName().equals("avatar")) {
                    // upload image
                    String nameFile = p.getSubmittedFileName();
                    p.write(uploadPath + File.separator + nameFile);
                    filenames.add(nameFile);
                }
            }
            request.setAttribute("files",filenames);
            request.getRequestDispatcher("/WEB-INF/views/show-image.jsp").forward(request, response);
        }
    }
}