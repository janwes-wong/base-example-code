package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream
 * @date 2021/8/12 17:19
 * @description
 */
public class Example {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Optional<Integer> optional = list.stream().filter(x -> x > 6).findAny();
        if (optional.isPresent()) {
            Integer result = optional.get();
            System.out.println(result);
        }
    }
}
