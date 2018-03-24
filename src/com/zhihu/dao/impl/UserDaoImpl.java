package com.zhihu.dao.impl;

import com.zhihu.dao.UserDao;
import com.zhihu.Warper.MyDataSource;
import com.zhihu.domain.User;
import com.zhihu.utils.DBCPUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) throws Exception {

        Connection conn = null;
        PreparedStatement ps = null;//此对象可以获取数据库中的数据

        DataSource ds = new MyDataSource ();//从池中取出一个连接MyConnection

        try {

            conn = ds.getConnection();
            //conn.setTransactionIsolation (Connection.TRANSACTION_REPEATABLE_READ);//mysql默认级别
            conn.setAutoCommit (false);//开启事务
            ps = conn.prepareStatement("INSERT INTO information(id,PASSWORD) VALUES(?,?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();

            conn.commit();//提交事务
            //int i = ps.executeUpdate();
        } catch (Exception e) {
            try{
                conn.rollback ();       //回滚事务
            }catch(SQLException e1){
            e1.printStackTrace();        //输出整个调用流程“深层次的输出异常调用流程”
            throw new RuntimeException("添加失败！");
            }
            e.printStackTrace();
        } finally {
            DBCPUtil.release (conn,ps,null);
        }
    }


    public User findUser(User user) throws Exception {

        DataSource ds = new MyDataSource ();//从池中取出一个连接MyConnection

        Connection conn = ds.getConnection ();
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;

         try {
             conn.setAutoCommit (false);//开启事务
             ps = conn.prepareStatement("SELECT * FROM USER WHERE id=? AND password=?");
             ps.setString(1, user.getId());
             ps.setString(2, user.getPassword());

             rs = ps.executeQuery();
             if (rs.next()) {
                 u = new User();
                 u.setId(rs.getString(1));
                 u.setPassword(rs.getString(2));
             }
             conn.commit();//提交事务
         }catch(Exception e){
             try{
                 conn.rollback ();       //回滚事务
             }catch(SQLException e1){
                 e1.printStackTrace();        //输出整个调用流程“深层次的输出异常调用流程”
             }
             e.printStackTrace();
         } finally {
             DBCPUtil.release(conn,ps,rs);
         }
        return u;
    }

    public boolean findUserByName(String id) throws SQLException {

        DataSource ds = new MyDataSource ();//从池中取出一个连接MyConnection

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn.setAutoCommit (false);//开启事务

            conn = ds.getConnection();
            ps = conn.prepareStatement("select * from information where id=?");
            ps.setString(1, id);

            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            conn.commit();//提交事务

        } catch (Exception e) {
            try{
                conn.rollback ();       //回滚事务
            }catch(SQLException e1){
                e1.printStackTrace();        //输出整个调用流程“深层次的输出异常调用流程”
            }
            e.printStackTrace();
        }finally{
            DBCPUtil.release (conn,ps,rs);
        }
        return false;
    }
}
