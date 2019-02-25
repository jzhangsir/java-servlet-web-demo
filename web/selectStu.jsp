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
        <div class="form_table"
             style="background:#ffffff;width: 600px;margin-bottom: 100px;float: left;margin-left: 200px">
            <h3 style="text-align: center">查询学生</h3>
            <form action="Servlet?method=selectStudent" method="post">
                <div class="form">
                    <input name="studentid" class="input1" type="text" placeholder="请输入学号"
                           style="padding: 6px 20px;border-radius: 4px;border: 4px;box-shadow: inset 0 1px 1px rgba(0,0,0,.075);margin-left: 200px">
                    <button style="color: #fff;background-color: #337ab7;border-radius: 4px;border-color: #2e6da4;padding: 6px 12px;border: none"
                            class="btn active">
                        查询
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
