package com.zhihu.domain;

import java.util.HashMap;
import java.util.Map;

public class UserForm {
    private String id;
    private String password;


    Map<String, String> msg = new HashMap<String, String>();

    /*用户名：必须输入，且3~8位的字母组成<br>
    密码：必须输入，3~8位的数组组成<br>*/
    public boolean validate(){

        if("".equals(id)){
            msg.put("username", "用户名不能为空！");
        }else if(!id.matches("\\w{3,8}")){//用户名：必须输入，且3~8位的字母组成<br>
            msg.put("username", "用户名为3~8位的字母组成");
        }

        if("".equals(password)){
            msg.put("password", "密码不能为空！");
        }else if(!password.matches("\\d{3,8}")){//密码：必须输入，3~8位的数组组成<br>
            msg.put("password", "密码为3~8位的数字组成");
        }
        return msg.isEmpty();//当map集合中没有数据时，返回true

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<String, String> getMsg() {
        return msg;
    }

    public void setMsg(Map<String, String> msg) {
        this.msg = msg;
    }

}

