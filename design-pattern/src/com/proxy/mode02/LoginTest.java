package com.proxy.mode02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoginTest {
    public static void main(String[] args) {
        LoginImpl li = new LoginImpl();

        Login proxy = (Login) Proxy.newProxyInstance(li.getClass().getClassLoader(),
                new Class[]{Login.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("日志记录");
                        Object o = method.invoke(li, args);
                        System.out.println("打印记录");
                        return o;
                    }
                });

        proxy.login();

        System.out.println("=================");

        proxy.logout();
    }
}
