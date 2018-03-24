package com.zhihu.Warper;

import com.zhihu.utils.DBUtils;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Logger;

public class MyDataSource implements DataSource {

    //创建一个存放链接的池子
    private static LinkedList<Connection> pool = (LinkedList<Connection>) Collections.synchronizedList (new LinkedList<Connection> ());

    static{
        try {
            for(int i = 0;i < 10;i++){
                Connection conn = DBUtils.getConnection ();
                pool.add (conn);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError ("初始化数据库连接失败，请检查配置文件是否正确！！");
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        //得到一个链接
            Connection conn = null;
            if(pool.size()>0){
                conn = pool.removeFirst ();//从池中取出链接
                Connection myConn = new MyConnection (conn,pool);//得到一个包装后的MyConnection对象
                return myConn;
            }else {
                //等待
                //新创建一个链接，这个链接要用close（）关闭！！
                throw new RuntimeException ("链接都在用,服务器真的忙。。。");
            }
    }




    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
