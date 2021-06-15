package com.ml.timi.study.jdbc;

import java.sql.*;


/**
 * Description: 原生JDBC连接
 * Copyright (C), 2021 2021/6/12 23:20
 * Author:        Lin
 * History:       <author>          <time>          <version>          <desc>
 */
public class JdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /**
         * 原生jdbc访问数据库步骤
         *
         * 加载JDBC驱动程序
         * 创建数据库的连接
         * 创建preparedStatement
         * 执行SQL语句
         * 处理结果集
         * 关闭JDBC对象资源
         */

        //加载JDBC驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //连接地址
        String url = "jdbc:mysql://127.0.0.1:3306/timi?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        //连接账号密码
        String username = "root";
        String password = "root";

        //获取连接对象，并连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        //创建preparedStatement,获取语句对象
        Statement statement = connection.createStatement();

        //执行SQL语句
        ResultSet resultSet = statement.executeQuery("select * from user");

        //处理结果集
        while (resultSet.next()) {

            System.out.println("用户密码:" + resultSet.getString("password"));

        }
        //关闭JDBC对象资源
        statement.close();
    }
}
