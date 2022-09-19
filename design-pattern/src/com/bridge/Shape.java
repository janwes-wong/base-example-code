package com.bridge;

/**
 * @author Janwes
 * @version 1.0
 * @package com.bridge
 * @date 2021/11/4 18:06
 * @description 图形类
 */
public abstract class Shape {

    protected ColorApi colorApi;

    /**
     * 绘制 注入颜色
     *
     * @param colorApi
     */
    protected void setDraw(ColorApi colorApi) {
        this.colorApi = colorApi;
    }

    public abstract void draw();
}
