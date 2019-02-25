package com.project.dao;

import com.project.entity.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements StudentDao {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    //获取学生列表
    @Override
    public List<Student> list() {
        List<Student> students = new ArrayList<>();
        try {
            conn = ConnectMange.getConnection();
            String sql = "select * from student";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Student stu = new Student();
                String id=rs.getString("studentid");
                String name=rs.getString("studentname");
                String sub=rs.getString("subject");
                String col=rs.getString("college");
                stu.setStudentid(id);
                stu.setStudentname(name);
                stu.setSubject(sub);
                stu.setCollege(col);
                students.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectMange.close(conn, ps, rs);
        }
        return students;
    }
    //通过学号查询
    @Override
    public Student  getStu(String studentid){
        Student student = new Student();
        try {
            conn = ConnectMange.getConnection();
            String sql = "select * from student where studentid=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, studentid);
            rs = ps.executeQuery();
            while (rs.next()){
                String id=rs.getString("studentid");
                String name=rs.getString("studentname");
                String subject=rs.getString("subject");
                String college=rs.getString("college");
                student.setStudentid(id);
                student.setStudentname(name);
                student.setSubject(subject);
                student.setCollege(college);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectMange.close(conn, ps, rs);
        }
        return student;
    }
    @Override
    public int getStuName(String studentname){
        int result=0;
        Student student=new Student();
        try {
            conn = ConnectMange.getConnection();
            String sql = "select * from student where studentname=?";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                String name=rs.getString("studentname");
                student.setStudentname(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectMange.close(conn, ps, rs);
        }
       return  result;
    }
    //添加学生
    @Override
    public int addStudent(Student student){
        int resule=0;
        try{
            conn= ConnectMange.getConnection();
            String sql="insert into student(studentid,studentname,subject,college) values (?,?,?,?)";
            ps=conn.prepareStatement(sql);
            ps.setString(1, student.getStudentid());
            ps.setString(2, student.getStudentname());
            ps.setString(3, student.getSubject());
            ps.setString(4, student.getCollege());
            resule=ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ConnectMange.close(conn, ps, rs);
        }
        return resule;
    }
    //删除学生
    @Override
    public int delStudent(String studentid){
        int result=0;
        conn= ConnectMange.getConnection();
        try{
            String sql="delete from student where studentid='"+studentid+"'";
            ps=conn.prepareStatement(sql);
            result=ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ConnectMange.close(conn, ps, rs);
        }
        return result;
        }
    //修改学生
    @Override
    public int updateStudent(Student student){
        int result=0;
        conn= ConnectMange.getConnection();
        try{
            String sql="update student set studentname=?,subject=?,college=? where studentid=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, student.getStudentname());
            ps.setString(2, student.getSubject());
            ps.setString(3, student.getCollege());
            ps.setString(4, student.getStudentid());
            result=ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            ConnectMange.close(conn, ps, rs);
        }
        return result;
    }
}
