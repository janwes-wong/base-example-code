package com.mycode;

import java.util.Random;
import java.util.Scanner;

public class DoubleColorBall {
    private Random r = new Random();
    private Scanner sc = new Scanner(System.in);

    /**
     * 此方法用于获取中奖的红球号码
     */
    public int[] luckyRedBall() {
        int[] RedBallArr = new int[6];

        for (int i = 0; i < RedBallArr.length; i++) {

            int RedBallNum = r.nextInt(33) + 1;

            if (numberExist(RedBallArr, RedBallNum)) {
                i--;
                continue;
            }
            RedBallArr[i] = RedBallNum;
        }

        return RedBallArr;
    }

    /**
     * 此方法用于获取中奖的蓝球号码
     */
    public int luckyBlueBall() {
        return r.nextInt(16) + 1;
    }

    /**
     * 此方法用于购买红球号码
     */
    public int[] buyRedBall() {
        int[] buyRedBallArr = new int[6];
        System.out.println("请输入您购买的红球号码：");

        int index = 0;

        while (index < buyRedBallArr.length) {
            int buyRedBallNum = sc.nextInt();

            if ((buyRedBallNum >= 1 && buyRedBallNum <= 33) && !numberExist(buyRedBallArr, buyRedBallNum)) {
                buyRedBallArr[index] = buyRedBallNum;
                index++;
            } else {
                System.out.println("您输入购买的红球号码有误，请重新输入：");
            }
        }
        return buyRedBallArr;
    }

    /**
     * 此方法用于购买蓝球号码
     */
    public int buyBlueBall() {
        System.out.println("请输入您购买的红球号码：");
        int buyBlueBallNum = sc.nextInt();
        while (true) {
            if (buyBlueBallNum >= 1 && buyBlueBallNum <= 16) {
                return buyBlueBallNum;
            }

            System.out.println("您输入购买的蓝球号码有误，请重新输入：");
        }
    }

    /**
     * 此方法用于判断购买的红球与中奖的红球相同的个数
     */
    public int RedBallSame(int[] luckyRedBallArr, int[] buyRedBallArr) {
        //计算相同的个数
        int redCount = 0;
        for (int i = 0; i < luckyRedBallArr.length; i++) {
            if (luckyRedBallArr[i] == buyRedBallArr[i]) {
                redCount++;
            }
        }
        return redCount;
    }

    /**
     * 此方法用于判断购买的蓝球是否与中奖的蓝球相同
     */
    public boolean blueBallSame(int num1, int num2) {
        if (num1 == num2) {
            return true;
        }
        return false;
    }

    /**
     *此方法用于计算双色球中奖的奖金分配
     * @param blueBallSame
     * @param redBallSame
     */
    public void calculatorBonus(boolean blueBallSame, int redBallSame) {
        System.out.print("本期双色球中奖结果： ");
        //如果蓝球相同
        if (blueBallSame) {
            if (redBallSame == 6) {
                System.out.println("恭喜您中奖¥500w RMB");
            } else if (redBallSame == 5) {
                System.out.println("恭喜您中奖¥3000 RMB");
            } else if (redBallSame == 4) {
                System.out.println("恭喜您中奖¥200 RMB");
            } else if (redBallSame == 3) {
                System.out.println("恭喜您中奖¥10 RMB");
            } else if (redBallSame == 2 || redBallSame == 1) {
                System.out.println("恭喜您中奖¥5 RMB");
            }
            //如果蓝球不相同
        } else {
            if (redBallSame == 6){
                System.out.println("恭喜您中奖¥150w RMB");
            }else if (redBallSame == 5){
                System.out.println("恭喜您中奖¥200 RMB");
            }else if (redBallSame == 4){
                System.out.println("恭喜您中奖¥10 RMB");
            }else {
                System.out.println("欢迎再次惠顾！感谢您为中国福利彩票事业的发展贡献一份力量！！！");
            }
        }
    }


    /**
     * 此方法用于判断生成随机数的数字是否存在
     * true---表示存在相同数字  false---表示不存在相同数字
     */
    public boolean numberExist(int[] arr, int num) {
        for (int i = 0; i < 6; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
