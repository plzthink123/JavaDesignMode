package com.think123.mysql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Test {
    private static String username;
    private static String password;
    private static String url;
    private static String driver;
    private static Connection con=null;
    static{
        InputStream is=Test.class.getResourceAsStream("/db.properties");
        Properties properties=new Properties();
        try {
            properties.load(is);
            url=properties.getProperty("url");
            username=properties.getProperty("username");
            password=properties.getProperty("password");
            driver=properties.getProperty("driver");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static Connection getCon() throws ClassNotFoundException {
        Class.forName(driver);
        if(con==null){
            try {
                con= DriverManager.getConnection(url,username,password);
                System.out.println("数据库连接成功");
            } catch (SQLException e) {
                System.out.println("数据库连接失败!");
                e.printStackTrace();
            }
        }
        return con;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Connection con = getCon();
    }
}