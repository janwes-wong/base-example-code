package com.exercise.string.stringdemo;

public class GirlFriendTest {
    public static void main(String[] args) {
        //创建对象数组
        GirlFriend[] arr = new GirlFriend[3];

        GirlFriend gf = new GirlFriend("小诗诗",20);
        GirlFriend gf1 = new GirlFriend("小惠惠",22);
        GirlFriend gf2 = new GirlFriend("小丹丹",23);
        //将对象属性赋值给数组
        arr[0] = gf;
        arr[1] = gf1;
        arr[2] = gf2;
        //遍历对象数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName()+"---"+arr[i].getAge());
            //System.out.println(arr[i].getName()+arr[i].getAge());
            //System.out.println(arr[i]);
        }
    }
}
