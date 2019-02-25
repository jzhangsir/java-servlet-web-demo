package com.project.dao;

import java.sql.*;

public class ConnectMange {
    private static final String DRIVER_CLASS="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DATABASE_URL="jdbc:sqlserver://localhost:1433;databasename=teststudent";
    private static final String DATABASE_USER="sa";
    private static final String DATABASE_PASSWORD="123456789";
    //获取连接
    public static Connection getConnection(){
        Connection conn=null;
        try{
            Class.forName(DRIVER_CLASS);
            conn= DriverManager.getConnection(DATABASE_URL,DATABASE_USER,DATABASE_PASSWORD);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    //关闭资源
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        try{
            if (conn!=null && !conn.isClosed()){
                conn.close();
            }
            if (ps!=null && !ps.isClosed()){
                ps.close();
            }
            if (rs!=null && !rs.isClosed()){
                rs.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

