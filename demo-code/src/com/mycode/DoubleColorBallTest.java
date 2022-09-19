package com.mycode;

public class DoubleColorBallTest {
    public static void main(String[] args) {
        //创建对象
        DoubleColorBall d = new DoubleColorBall();

        //中奖的红球号码
        int[] luckyRedBall = d.luckyRedBall();


        //中奖的蓝球号码
        int luckyBlueBall = d.luckyBlueBall();

        //展示今期开奖的双色球
        System.out.println("---*=====☆☆☆☆☆中国福利彩票双色球☆☆☆☆☆=====*---");
        System.out.println("        ***=====2020年12月15日 第85期=====***    ");
        System.out.print("         ***红球:");
        for (int i = 0; i < luckyRedBall.length; i++) {
            System.out.print(luckyRedBall[i]+" ");
        }
        System.out.print("蓝球:"+luckyBlueBall+"***");
        System.out.println();
        System.out.println("-----------*=====☆☆☆☆☆☆☆☆☆☆=====*----------");

        System.out.println();

        //购买的红球号码
        int[] buyRedBall = d.buyRedBall();

        //购买的蓝球号码
        int buyBlueBall = d.buyBlueBall();

        //展示用户购买的双色球
        System.out.println("---*=====☆☆☆☆☆中国福利彩票双色球☆☆☆☆☆=====*---");
        System.out.print("          ***红球：");
        for (int i = 0; i < buyRedBall.length; i++) {
            System.out.print(buyRedBall[i]+" ");
        }
        System.out.print("蓝球："+buyBlueBall+"***");
        System.out.println();
        System.out.println();
        System.out.println("            【开奖日期】*2020年12月30日*");
        System.out.println("-----------*=====☆☆☆☆☆☆☆☆☆☆=====*----------");
        System.out.println();

        int redBallSame = d.RedBallSame(luckyRedBall, buyRedBall);

        boolean blueBallSame = d.blueBallSame(luckyBlueBall, buyBlueBall);

        d.calculatorBonus(blueBallSame, redBallSame);
    }
}
