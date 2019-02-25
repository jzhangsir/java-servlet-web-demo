package com.project.entity;

public class Student {
    private String studentid;
    private  String studentname;
    private String subject;
    private String college;

    public Student(){

    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCollege() {
        return college;
    }

    public String getStudentid() {
        return studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public String getSubject() {
        return subject;
    }
}

