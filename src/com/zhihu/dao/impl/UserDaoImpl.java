package com.zhihu.dao.impl;

import com.zhihu.dao.UserDao;
import com.zhihu.domain.User;
import com.zhihu.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public void addUser(User user) throws Exception {

        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = null;
            ps = null;

            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("INSERT INTO information(id,PASSWORD) VALUES(?,?)");
            ps.setString(1, user.getId());
            ps.setString(2, user.getPassword());

            int i = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("添加失败！");
        } finally {
            DBUtils.closeAll(null, ps, conn);
        }

    }


    public User findUser(User user) throws Exception {
        Connection conn = DBUtils.getConnection ();
        PreparedStatement ps = null;
        ResultSet rs = null;
        User u = null;
         try {
             ps = conn.prepareStatement("SELECT * FROM USER WHERE id=? AND password=?");
             ps.setString(1, user.getId());
             ps.setString(2, user.getPassword());

             rs = ps.executeQuery();
             if (rs.next()) {
                 u = new User();
                 u.setId(rs.getString(1));
                 u.setPassword(rs.getString(2));
             }
         }catch(Exception e){
             e.printStackTrace();
         }
         finally {
             DBUtils.closeAll(rs,ps,conn);
         }
        return u;
    }

    public boolean findUserByName(String id) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement("select * from information where id=?");
            ps.setString(1, id);

            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            DBUtils.closeAll(rs, ps, conn);
        }
        return false;
    }
}
