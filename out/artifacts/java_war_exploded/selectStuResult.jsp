<%@ page import="com.project.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body style="background: #f3f3f3;">
<div class="container">
    <div class="form-contain" style="margin-top: 50px">
        <ul class="nav  nav-stacked" style="width: 200px;height: 500px;background:#ffffff;float: left">
            <li role="presentation" class="active"><a href="selectStu.jsp">查询学生</a></li>
            <li role="presentation"><a href="StuMange.jsp">学生管理</a></li>
            <li role="presentation"><a href="addStu.jsp">添加学生</a></li>
        </ul>
        <% Student student = (Student) request.getAttribute("student");%>
        <div style="margin-top: 50px">
            <table border="1px" class="table table-striped table-hover" style="width: 70%;margin: auto; ">
                <tr>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>专业</th>
                    <th>学院</th>
                    <th>删除</th>
                    <th>修改</th>
                </tr>
                <tr>
                    <td><%=student.getStudentid()%>
                    </td>
                    <td><%=student.getStudentname()%>
                    </td>
                    <td><%=student.getSubject()%>
                    </td>
                    <td><%=student.getCollege()%>
                    </td>
                    <td><a href="Servlet?method=deleteStudent&studentid=<%=student.getStudentid()%>">删除</a></td>
                    <td>
                        <a href="Servlet?method=toUpdateStudent&studentid=<%=student.getStudentid()%>">修改</a>
                    </td>
            </table>
        </div>
    </div>
</div>
</div>
</body>
</html>
