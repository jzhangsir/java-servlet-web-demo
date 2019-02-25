<%@ page import="com.project.dao.StudentDaoImp" %>
<%@ page import="com.project.dao.StudentDao" %>
<%@ page import="java.util.List" %>
<%@ page import="com.project.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body style="background: #f3f3f3">
<div class="container">
<div class="form-contain" style="margin-top: 50px">
    <ul class="nav  nav-stacked" style="width: 200px;height: 500px;background:#ffffff;float: left">
        <li role="presentation" class="active"><a href="selectStu.jsp">查询学生</a></li>
        <li role="presentation"><a href="StuMange.jsp">学生管理</a></li>
        <li role="presentation"><a href="addStu.jsp">添加学生</a></li>
    </ul>
    <div class="form" style="background: #ffffff;width: 600px;float: left;margin-left: 200px">
        <h3 style="text-align: center">学生管理</h3>
        <table border="1px" class="table table-striped table-hover" style="width: 500px;margin: auto">
            <tr>
                <th>学号</th>
                <th>姓名</th>
                <th>专业</th>
                <th>学院</th>
                <th>删除</th>
                <th>修改</th>
            </tr>
            <% StudentDao studentDao=new StudentDaoImp();
                List<Student> list=studentDao.list();
                for (Student stu:list)
                {%>
            <tr>
                <td><%=stu.getStudentid()%></td>
                <td><%=stu.getStudentname()%></td>
                <td><%=stu.getSubject()%></td>
                <td><%=stu.getCollege()%></td>
                <td><a id="del" href="Servlet?method=deleteStudent&studentid=<%=stu.getStudentid()%>">删除</a></td>
                <td>
                    <a href="Servlet?method=toUpdateStudent&studentid=<%=stu.getStudentid()%>">修改</a>
                </td>
            </tr>
                <%}
            %>
        </table>
    </div>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        $(function () {
            $("#del").click(function () {
                var flag=confirm("确定要删除？");
                return flag;
            })
        })
    </script>
</div>
</div>
</body>
</html>
