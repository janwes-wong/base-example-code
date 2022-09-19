package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream
 * @date 2022/1/27 15:32
 * @description java stream流操作案例
 */
public class StreamOperation {
    public static void main(String[] args) {
        statisticsCount();
        getMax();
        getMin();
        summary();
        concat();
    }

    private static void statisticsCount() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        long addCount = nums.stream().filter(val -> val % 2 == 1).count();
        System.out.println("统计元素为奇数的个数：" + addCount);
        long eCount = nums.stream().filter(val -> val % 2 == 0).count();
        System.out.println("统计元素为偶数的个数：" + eCount);
    }

    private static void getMax() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Integer value = nums.stream().max(Comparator.comparingInt(o -> o)).get();
        System.out.println("最大值：" + value);
    }

    private static void getMin() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Integer value = nums.stream().min(Comparator.comparingInt(o -> o)).get();
        System.out.println("最小值：" + value);
    }

    private static void summary() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        // 求和-方式一
        // 原始
        /*Integer value1 = nums.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer val1, Integer val2) {
                return val1 + val2;
            }
        });*/
        int v = nums.stream().mapToInt(value -> value).sum();
        System.out.println(v);
        // 简化
        //Integer value1 = nums.stream().reduce(0, (sum, val) -> sum += val);
        // 再次简化
        Integer value1 = nums.stream().reduce(0, Integer::sum);
        System.out.println("求和-方式一：" + value1);
        Integer value2 = nums.stream().reduce(0, (sum, val) -> sum += val, Integer::sum);
        System.out.println("求和-方式二：" + value2);

        List<CityInfo> cityInfos = new ArrayList<>();
        cityInfos.add(new CityInfo("A003", "深圳市", "25.92", "10.7"));
        cityInfos.add(new CityInfo("A003", "深圳市", "", "10.7"));
        cityInfos.add(new CityInfo("A003", "深圳市", "25.21", "10.7"));
        cityInfos.add(new CityInfo("A003", "深圳市", "10.25", "10.7"));
        cityInfos.add(new CityInfo("A003", "深圳市", "13.6", "10.7"));
        cityInfos.add(new CityInfo("A003", "深圳市", "", "10.7"));
        double sum = cityInfos.stream().mapToDouble(new ToDoubleFunction<CityInfo>() {
            @Override
            public double applyAsDouble(CityInfo o) {
                if (o.getAbsolute() != null && !o.getAbsolute().equals("")) {
                    return Double.parseDouble(o.getAbsolute());
                }
                return 0;
            }
        }).sum();
        System.out.println(sum);
    }

    /**
     * 将两个list集合封装一起
     */
    private static void concat() {
        List<Integer> a = Arrays.asList(10, 20, 30);
        List<Integer> b = Arrays.asList(2, 4, 6);
        Stream<Integer> aStream = Stream.of((Integer[]) a.toArray());
        Stream<Integer> bStream = Stream.of((Integer[]) b.toArray());
        List<Object> list = Stream.concat(aStream, bStream).collect(Collectors.toList());
        System.out.println(list);
    }
}
