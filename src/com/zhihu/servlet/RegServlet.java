package com.zhihu.servlet;

import com.zhihu.domain.User;
import com.zhihu.domain.UserForm;
import com.zhihu.service.UserService;
import com.zhihu.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //获取表单数据
        // 验证操作
        UserForm uf = new UserForm ();
        try {
            BeanUtils.populate(uf, request.getParameterMap());
        } catch (Exception e1) {
            e1.printStackTrace();
        }

        if (!uf.validate()) {// 如果map中不为空，说明有错误信息
            request.setAttribute("uf", uf);
            request.getRequestDispatcher("/reg.jsp").forward(request, response);
            return;
        }
        User user = new User();
        try {
            BeanUtils.populate(user, request.getParameterMap());

        //调用业务逻辑
            UserService us = new UserServiceImpl();
            //查看用户名是否已被注册
            us.findUserByName(user.getId());

            us.register (user);

            }catch(Exception e){
                e.printStackTrace();
            }
        //分发转向
        response.getWriter().write("注册成功！1秒跳转到主页");
        response.setHeader("refresh", "1;url=" + request.getContextPath()
                + "/index.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
