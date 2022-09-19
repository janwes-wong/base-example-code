package com.stream;

/**
 * @author Janwes
 * @version 1.0
 * @package com.stream
 * @date 2021/10/7 15:12
 * @description
 */
public class CityInfo {

    private String code;

    private String city;

    private String absolute;

    private String rate;

    public CityInfo() {
    }

    public CityInfo(String code, String city, String absolute, String rate) {
        this.code = code;
        this.city = city;
        this.absolute = absolute;
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAbsolute() {
        return absolute;
    }

    public void setAbsolute(String absolute) {
        this.absolute = absolute;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "CityInfo{" +
                "code='" + code + '\'' +
                ", city='" + city + '\'' +
                ", absolute='" + absolute + '\'' +
                ", rate='" + rate + '\'' +
                '}';
    }
}
