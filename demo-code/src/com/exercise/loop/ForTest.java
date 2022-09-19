package com.exercise.loop;

public class ForTest {
    public static void main(String[] args) {
        //
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("------------");

        //
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        //求1~100之间的偶数
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("1~100之间的偶数和是"+sum);


        int sum1 = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 & i % 5 == 0){
                sum1 += i;
            }
        }
        System.out.println("1~100之间,既能被3整除又能被5整除的所有数据和是"+sum1);
    }
}
