package com.in;

/**
 * @author Janwes
 * @version 1.0.0
 * @package com.in
 * @date 2022/4/13 17:34
 * @description
 */
public class IFTest {
    public static void main(String[] args) {
        System.out.println(op(new Increment<Integer, Integer>() {
            @Override
            public Integer calculate(Integer t1, Integer t2) {
                return t1 + t2;
            }
        }));

        Increment<Integer, Integer> add = Integer::sum;
        Integer count = add.calculate(25, 40);
        System.out.println(count);
    }

    private static Integer op(Increment<Integer, Integer> in) {
        return in.calculate(10, 5);
    }
}
