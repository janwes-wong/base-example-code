package com.chain;

/**
 * @author Janwes
 * @version 1.0
 * @package com.chain
 * @date 2021/11/4 15:49
 * @description
 */
public abstract class Handler {

    public static final String METHOD_GET = "GET";

    public static final String METHOD_POST = "POST";

    public static final String METHOD_PUT = "PUT";

    public static final String METHOD_DELETE = "DELETE";

    protected Handler handler;

    /**
     * 责任链中的下一个元素
     */
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(String requestMethod);
}
