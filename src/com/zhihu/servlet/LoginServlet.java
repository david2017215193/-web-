package com.zhihu.servlet;

import com.zhihu.domain.User;
import com.zhihu.service.UserService;
import com.zhihu.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        User user = new User();

        try {
            BeanUtils.populate(user, request.getParameterMap());
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        UserService us = new UserServiceImpl();

        User u;
        try {
            u = us.login(user);

            //分发转向
            if(u!=null){
                request.getSession().setAttribute("u", user);//如果登录成功，就把user对象放到session对象 中
                request.getRequestDispatcher("/main.jsp").forward(request, response);

            }else{//登录失败跳回登陆页面
                request.setAttribute("msg", "用户名或密码不正确！");
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
