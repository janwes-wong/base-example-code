package com.chain;

/**
 * @author Janwes
 * @version 1.0
 * @package com.chain
 * @date 2021/11/4 16:23
 * @description
 */
public class HandlerTest {
    public static void main(String[] args) {
        Handler get = new ConcreteHandlerA();
        Handler post = new ConcreteHandlerB();
        Handler delete = new ConcreteHandlerC();
        get.setNextHandler(post);
        post.setNextHandler(delete);

        get.handleRequest("GET");
        get.handleRequest("POST");
        get.handleRequest("DELETE");
    }
}
