package com.project.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "toupdateServlet",urlPatterns = "/toupdateServlet")
public class toupdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
//
//        String studentid=request.getParameter("studentid");
//        StudentDao studentDao=new StudentDaoImp();
//        Student student=studentDao.getStu(studentid);
//        request.setAttribute("student", student);
//        request.getRequestDispatcher("updateStu.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
