package com.locktest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Janwes
 * @version 1.0
 * @package com.locktest
 * @date 2021/8/23 10:52
 * @description
 */
public enum Exam {

    A("001", "A"),
    B("002", "B"),
    C("003", "C");

    private String code;

    private String desc;

    Exam(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static List<String> getCodes() {
        List<String> codes = new ArrayList<>();
        Exam[] values = Exam.values();
        for (Exam value : values) {
            codes.add(value.code);
        }
        return codes;
    }
}
