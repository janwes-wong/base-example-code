package com.proxy.mode01;

public class UserServicesImpl implements UserServices{

    @Override
    public void add() {
        System.out.println("增加了用户文件信息");
    }

    @Override
    public void delete() {
        System.out.println("删除了用户文件信息");
    }

    @Override
    public void update() {
        System.out.println("更新了用户文件信息");
    }

    @Override
    public void select() {
        System.out.println("查询了用户文件信息");
    }
}
