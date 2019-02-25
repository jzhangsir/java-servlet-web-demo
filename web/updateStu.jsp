<%@ page import="com.project.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <% Student student=(Student)request.getAttribute("student");%>
</head>
<body style="background: #f3f3f3">
<div class="container">
<div class="form-contain" style="margin-top: 50px">
    <ul class="nav  nav-stacked" style="width: 200px;height: 500px;background:#ffffff;float: left">
        <li role="presentation" class="active"><a href="selectStu.jsp">查询学生</a></li>
        <li role="presentation"><a href="StuMange.jsp">学生管理</a></li>
        <li role="presentation"><a href="addStu.jsp">添加学生</a></li>
    </ul>
    <div class="form_table" style="background:#ffffff;width: 500px;margin-left: 200px;margin-bottom: 50px;float: left">
        <h3 style="text-align: center">修改学生</h3>
        <form method="post" action="Servlet?method=updateStudent">
            <div class="form-container">
                <div class="form-group">
                    <input name="studentid" class="form-control" type="text" placeholder="学号"
                           style="width: 200px ;margin: auto" value="<%=student.getStudentid()%>" readonly="readonly">
                </div>
                <div class="form-group">
                    <input name="studentname" class="form-control" type="text" placeholder="姓名"
                           style="width: 200px;margin: auto" value="<%=student.getStudentname()%>">
                </div>
                <div class="form-group">
                    <input name="subject" class="form-control" type="text" placeholder="专业"
                           style="width: 200px;margin: auto" value="<%=student.getSubject()%>">
                </div>
                <div class="form-group">
                    <input name="college" class="form-control" type="text" placeholder="学院"
                           style="width: 200px;margin: auto" value="<%=student.getCollege()%>">
                </div>
                <div class="form-group">
                    <button class="btn btn-primary btn-block active" style="width: 200px;margin: auto"
                            type="submit">修改
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>
</div>
</body>
</html>
