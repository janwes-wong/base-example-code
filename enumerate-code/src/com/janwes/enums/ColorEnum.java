package com.janwes.enums;

/**
 * @author Janwes
 * @version 1.0
 * @package com.janwes.enums
 * @date 2021/12/22 18:17
 * @description
 */
public enum ColorEnum {
    WHITE(1, "白色"),
    BLACK(2, "黑色"),
    RED(3, "红色"),
    BLUE(4, "蓝色"),
    YELLOW(5, "黄色"),
    GREEN(6, "绿色");

    private int value;

    private String description;

    ColorEnum() {
    }

    ColorEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int value() {
        return this.value;
    }

    public String description() {
        return this.description;
    }
}
