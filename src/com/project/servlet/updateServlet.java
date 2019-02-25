package com.project.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updateServlet",urlPatterns = "/updateServlet")
public class updateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
//
//        String id=request.getParameter("studentid");
//        String sname=request.getParameter("studentname");
//        String sub=request.getParameter("subject");
//        String col=request.getParameter("college");
//        Student student=new Student();
//        student.setStudentid(id);
//        student.setStudentname(sname);
//        student.setSubject(sub);
//        student.setCollege(col);
//        StudentDao studentDao=new StudentDaoImp();
//        int result=studentDao.updateStudent(student);
//        if (result>0){
//            response.sendRedirect("StuMange.jsp");
//        }else {
//            response.sendRedirect("error.jsp");
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
