package com.janwes;

import com.janwes.enums.ColorEnum;
import com.janwes.enums.SeasonEnum;

import java.util.Arrays;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes
 * @date 2021/12/22 17:41
 * @description
 */
public class EnumTest {
    public static void main(String[] args) {
        SeasonEnum[] values = SeasonEnum.values();
        for (SeasonEnum value : values) {
            System.out.println(value.name());
        }
        System.out.println(Arrays.toString(SeasonEnum.values()));

        getEnumName(SeasonEnum.AUTUMN);
    }

    private static void getEnumName(SeasonEnum seasonEnum) {
        switch (seasonEnum) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
