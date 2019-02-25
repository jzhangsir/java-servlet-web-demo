package com.project.servlet;

import com.project.dao.StudentDao;
import com.project.dao.StudentDaoImp;
import com.project.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet", urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");


        String method = request.getParameter("method");
        switch (method) {
            case "addStudent":
                addStudent(request, response);
                break;
            case "updateStudent":
                updateStudent(request, response);
                break;

            case "selectStudent":
                selectStudent(request, response);
                break;

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("method");
        switch (method) {
            case "deleteStudent":
                deleteStudent(request, response);
                break;
            case "toUpdateStudent":
                toUpdateStudent(request, response);
                break;
        }
    }

    public static void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String sid = request.getParameter("studentid");
        String sname = request.getParameter("studentname");
        String sub = request.getParameter("subject");
        String col = request.getParameter("college");
        if (sid.equals("") || sname.equals("") || sub.equals("") || col.equals("")) {
            response.sendRedirect("error.jsp");
        } else {
            Student student = new Student();
            student.setStudentid(sid);
            student.setStudentname(sname);
            student.setSubject(sub);
            student.setCollege(col);
            StudentDao stu = new StudentDaoImp();
            int resule = stu.addStudent(student);
            if (resule > 0) {
                response.sendRedirect("StuMange.jsp");
            } else {
                response.sendRedirect("error.jsp");
            }
        }

    }

    public static void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String sid = request.getParameter("studentid");
        StudentDao studentDao = new StudentDaoImp();
        int result = studentDao.delStudent(sid);
        if (result > 0) {
            response.sendRedirect("StuMange.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }

    public static void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("studentid");
        String sname = request.getParameter("studentname");
        String sub = request.getParameter("subject");
        String col = request.getParameter("college");
        Student student = new Student();
        student.setStudentid(id);
        student.setStudentname(sname);
        student.setSubject(sub);
        student.setCollege(col);
        StudentDao studentDao = new StudentDaoImp();
        int result = studentDao.updateStudent(student);
        if (result > 0) {
            response.sendRedirect("StuMange.jsp");
        } else {
            response.sendRedirect("error.jsp");
        }
    }

    public static void selectStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String studentid = request.getParameter("studentid");
        StudentDao studentDao = new StudentDaoImp();
        Student student = studentDao.getStu(studentid);
        request.setAttribute("student", student);
        if (student.getStudentid() == null) {
            response.sendRedirect("error.jsp");
        } else {
            request.getRequestDispatcher("selectStuResult.jsp").forward(request, response);
        }
    }

    public static void toUpdateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String studentid = request.getParameter("studentid");
        StudentDao studentDao = new StudentDaoImp();
        Student student = studentDao.getStu(studentid);
        request.setAttribute("student", student);
        request.getRequestDispatcher("updateStu.jsp").forward(request, response);
    }
}
