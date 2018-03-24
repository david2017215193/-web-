package com.zhihu.dao;

import com.zhihu.domain.User;

import java.sql.SQLException;

public interface UserDao {


    /**
     * 添加用户信息
     */
    public void addUser(User user) throws Exception;
    /**
     * 根据用户名和密码查找用户信息
     * @param user
     * @return
     * @throws Exception
     */
    public User findUser(User user)throws Exception;

    /**
     * 根据用户名查找用户是否存在
     * @param name
     * @return
     **/
    public boolean findUserByName(String name) throws SQLException;
}
