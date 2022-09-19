package com.locktest;

import java.math.BigDecimal;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Janwes
 * @version 1.0
 * @package com.locktest
 * @date 2021/8/23 10:56
 * @description
 */
public class A {
    public static void main(String[] args) {
        List<String> codes = Exam.getCodes();
        codes = codes.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return !s.equals("003");
            }
        }).collect(Collectors.toList());
        System.out.println(codes);

        BigDecimal bigDecimal = new BigDecimal("88.56");
        bigDecimal = bigDecimal.setScale(0, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(bigDecimal);
    }
}
