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
        <div class="form_table" style="background:#ffffff;width: 500px;margin-left: 200px;float: left">
            <h3 style="text-align: center">添加学生</h3>
            <form action="Servlet?method=addStudent" method="post">
                <div class="form-container">
                    <div class="form-group">
                        <input name="studentid" class="form-control" type="text" placeholder="学号"
                               style="width: 200px ;margin: auto">
                    </div>
                    <div class="form-group">
                        <input name="studentname" class="form-control" type="text" placeholder="姓名"
                               style="width: 200px;margin: auto">
                    </div>
                    <div class="form-group">
                        <input name="subject" class="form-control" type="text" placeholder="专业"
                               style="width: 200px;margin: auto">
                    </div>
                    <div class="form-group">
                        <input name="college" class="form-control" type="text" placeholder="学院"
                               style="width: 200px;margin: auto">
                    </div>
                    <div class="form-group">
                        <button class="btn btn-primary btn-block active" style="width: 200px;margin: auto"
                                type="submit">添加
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
