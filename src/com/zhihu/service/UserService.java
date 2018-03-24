package com.zhihu.service;

import com.zhihu.domain.User;
import com.zhihu.esception.UserExistException;

import java.sql.SQLException;


public interface UserService {
    /**
     * 添加用户信息
     * @param user
     * @throws Exception
     */
    public void register(User user) throws Exception;

    /**
     * 根据用户名和密码查找用户信息
     * @param user
     * @return
     */
    public User login(User user);

    /**
     * 根据用户名查找用户是否存在
     * @return
     * @throws UserExistException
     */
    public boolean findUserByName(String name) throws UserExistException, SQLException;
}
