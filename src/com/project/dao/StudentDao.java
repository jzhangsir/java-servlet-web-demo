package com.project.dao;

import com.project.entity.Student;

import java.util.List;

public interface StudentDao {
    //通过学号查找学生
    public Student getStu(String studentid);

    public int getStuName(String studentname);
    //查询所有学生
    public List<Student> list();
    //添加学生
    public int addStudent(Student student);
    //删除学生
    public int delStudent(String studentid);
    //修改学生
    public int updateStudent(Student student);
}
