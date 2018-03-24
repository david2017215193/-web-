package com.zhihu.utils;

import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBCPUtil {

    private static DataSource ds = null;

    static {
        Properties prop = new Properties ();

        try {
            prop.load (DBCPUtil.class.getClassLoader ().getResourceAsStream ("dbcpconfig.properties"));//将获得的一个资源码文件DBCPUtil，用getClassLoader（）将其中的信息拿出封装为一个对象
            ds = BasicDataSourceFactory.createDataSource (prop);//得到数据源
        } catch (Exception e) {
            throw new ExceptionInInitializerError ("初始化错误，请检查配置文件");
        }
    }

    public static Connection getConnection() {
        try {
            return ds.getConnection ();
        } catch (SQLException e) {
            throw new RuntimeException ("服务器忙。。。");
        }
    }

    public static void release(Connection conn, Statement stmt, ResultSet rs) {
        //关闭资源
        if (rs != null) {
            try {
                rs.close ();
            } catch (Exception e) {
                e.printStackTrace ();
            }
        }
        rs = null;

        if (stmt != null) {
            try {
                stmt.close ();
            } catch (Exception e) {
                e.printStackTrace ();
            }
        }
        stmt = null;

        if (conn != null) {
            try {
                conn.close ();
            } catch (Exception e) {
                e.printStackTrace ();
            }
        }
        conn = null;
    }

}





