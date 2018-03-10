package com.zhihu.utils;

import java.sql.*;
import java.util.ResourceBundle;

public class DBUtils {
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;

    static {
        //此对象是用于加载properties
//        Locale locale=new Locale ("zh","CN");
        ResourceBundle rb = ResourceBundle.getBundle ("dbinfo");
        driverClass = rb.getString ("driverClass");
        url = rb.getString ("url");
        username = rb.getString ("username");
        password = rb.getString ("password");
        try {
            Class.forName (driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        }
    }

    //得到链接的方法
    public static Connection getConnection() throws Exception {
        System.out.println (url);
        return DriverManager.getConnection (url, username, password);
    }

    //关闭资源的方法
    public static void closeAll(ResultSet rs, Statement stmt, Connection conn) throws SQLException {
        //关闭资源
        if (rs != null) {
                rs.close ();
        }else {

        if (stmt != null) {
                stmt.close ();
            }else {

        if (conn != null) {
              conn.close ();
            }   }
        }
    }
}
