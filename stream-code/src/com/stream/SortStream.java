package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream
 * @date 2021/10/7 15:11
 * @description
 */
public class SortStream {

    public static void main(String[] args) {
        List<CityInfo> cityInfos = list();
        System.out.println(">>> 排序前 ===> " + cityInfos.toString());
        cityInfos = cityInfos.stream().sorted(Comparator.comparingDouble(o -> Double.parseDouble(o.getAbsolute())))
                .collect(Collectors.toList());
        System.out.println(">>> 排序后 ===> " + cityInfos.toString());
        Collections.reverse(cityInfos);
        System.out.println(">>> 降序排序 ===> " + cityInfos.toString());
    }

    private static List<CityInfo> list() {
        List<CityInfo> cityInfos = new ArrayList<>();
        cityInfos.add(new CityInfo("A001", "江门市", "25.28", "10.7"));
        cityInfos.add(new CityInfo("A005", "清远市", "25.20", "10.7"));
        cityInfos.add(new CityInfo("A004", "揭阳市", "25.96", "10.7"));
        cityInfos.add(new CityInfo("A003", "深圳市", "25.92", "10.7"));
        cityInfos.add(new CityInfo("A002", "广州市", "25.90", "10.7"));
        cityInfos.add(new CityInfo("A006", "肇庆市", "25.98", "10.7"));
        cityInfos.add(new CityInfo("A008", "潮州市", "32.05", "10.7"));
        cityInfos.add(new CityInfo("A007", "汕头市", "60.78", "10.7"));
        cityInfos.add(new CityInfo("A012", "湛江市", "15.48", "10.7"));
        cityInfos.add(new CityInfo("A011", "茂名市", "100.25", "10.7"));
        cityInfos.add(new CityInfo("A018", "珠海市", "36.22", "10.7"));
        cityInfos.add(new CityInfo("A015", "阳江市", "17.20", "10.7"));
        cityInfos.add(new CityInfo("A014", "佛山市", "8.74", "10.7"));
        cityInfos.add(new CityInfo("A010", "中山市", "91.73", "10.7"));
        cityInfos.add(new CityInfo("A019", "韶关市", "53.28", "10.7"));
        cityInfos.add(new CityInfo("A020", "河源市", "39.67", "10.7"));
        cityInfos.add(new CityInfo("A021", "梅州市", "49.62", "10.7"));
        cityInfos.add(new CityInfo("A009", "汕尾市", "78.25", "10.7"));
        cityInfos.add(new CityInfo("A013", "东莞市", "19.61", "10.7"));
        cityInfos.add(new CityInfo("A016", "惠州市", "18.40", "10.7"));
        cityInfos.add(new CityInfo("A017", "云浮市", "17.20", "10.7"));
        return cityInfos;
    }
}