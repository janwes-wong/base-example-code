package com.proxy.mode01;

public class ProxyTest {
    public static void main(String[] args) {
        // 创建被代理对象
        UserServicesImpl userServices = new UserServicesImpl();
        // 创建间接代理对象
        TargetProxy tp = new TargetProxy();
        // 通过set方法传入参数
        tp.setTarget(userServices);

        // 调用方法获取真正的动态代理对象
        UserServices proxy = (UserServices) tp.getProxy();

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.select();
    }
}
