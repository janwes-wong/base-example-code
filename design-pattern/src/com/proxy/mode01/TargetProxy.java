package com.proxy.mode01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TargetProxy implements InvocationHandler {
    // 被代理的对象
    private Object target;

    public TargetProxy() {
    }

    public TargetProxy(Object target) {
        this.target = target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    /**
     * 此方法用于获取真正的动态代理对象
     *
     * @return 代理对象
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    /**
     * 此方法用于定义动态代理增加方法
     *
     * @param proxy     动态代理对象
     * @param method    被拦截的方法
     * @param args      被拦截的方法参数
     * @return          被拦截的方法返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        System.out.println("前置增强了<" + name + ">方法");
        Object o = method.invoke(target, args);
        System.out.println("后置增强");
        return o;
    }
}
