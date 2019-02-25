package com.project.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "delStuServlet",urlPatterns = "/delStuServlet")
public class delStuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
//
//        String sid=request.getParameter("studentid");
//        StudentDao studentDao=new StudentDaoImp();
//        int result= studentDao.delStudent(sid);
//        if (result>0){
//            response.sendRedirect("StuMange.jsp");
//        }else {
//            response.sendRedirect("error.jsp");
//        }
    }


}
