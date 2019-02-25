//package com.project.servlet;
//
//
//import com.project.dao.StudentDao;
//import com.project.dao.StudentDaoImp;
//import com.project.entity.Student;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "addStuServlet",urlPatterns = "/addStuServlet")
//public class addStuServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
//        response.setContentType("text/html;charset=utf-8");
//
//        String sid = request.getParameter("studentid");
//        String sname = request.getParameter("studentname");
//        String sub = request.getParameter("subject");
//        String col = request.getParameter("college");
//        Student student=new Student();
//        if (sid.equals(student.getStudentid())){
//            response.sendRedirect("error.jsp");
//        }else {
//            student.setStudentid(sid);
//            student.setStudentname(sname);
//            student.setSubject(sub);
//            student.setCollege(col);
//            StudentDao stu=new StudentDaoImp();
//            int resule=stu.addStudent(student);
//            if (resule>0){
//                response.sendRedirect("StuMange.jsp");
//            }else {
//                response.sendRedirect("error.jsp");
//            }
//        }
//
//
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
//}
