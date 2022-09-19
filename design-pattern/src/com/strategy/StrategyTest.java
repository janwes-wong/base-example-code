package com.strategy;

/**
 * @author Janwes
 * @version 1.0
 * @package com.strategy
 * @date 2021/11/3 17:50
 * @description
 */
public class StrategyTest {
    public static void main(String[] args) {
        // 加
        Context context = new Context(new AddOperation());
        System.out.println(context.executeStrategy(10, 5));

        // 减
        context = new Context(new SubtractOperation());
        System.out.println(context.executeStrategy(10, 5));

        // 乘
        context = new Context(new MultiplyOperation());
        System.out.println(context.executeStrategy(10, 5));

        // 除
        context = new Context(new DivideOperation());
        System.out.println(context.executeStrategy(10, 0));
    }
}
