package com.proxy.mode02;

public class LoginImpl implements Login {

    @Override
    public void login() {
        System.out.println("用户登录成功");
    }

    @Override
    public void logout() {
        System.out.println("用户退出成功");
    }
}
