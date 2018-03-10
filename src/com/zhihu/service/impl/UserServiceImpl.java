package com.zhihu.service.impl;

import com.zhihu.dao.UserDao;
import com.zhihu.dao.impl.UserDaoImpl;
import com.zhihu.domain.User;
import com.zhihu.esception.UserExistException;
import com.zhihu.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();
    public void register(User user) throws Exception {
        userDao.addUser(user);

    }

    @Override
    public User login(User user){
        User u = null;
        try{
            u = userDao.findUser(user);
        }catch(Exception e){
            e.printStackTrace();
        }
        return u;
    }

    public boolean findUserByName(String id) throws UserExistException, SQLException {
        boolean b = userDao.findUserByName(id);
        if(b){
            throw new UserExistException("用户名已存在");
        }
        return b;
    }
}
