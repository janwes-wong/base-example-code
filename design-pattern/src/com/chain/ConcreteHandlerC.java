package com.chain;

/**
 * @author Janwes
 * @version 1.0
 * @package com.chain
 * @date 2021/11/4 16:25
 * @description
 */
public class ConcreteHandlerC extends Handler {
    @Override
    public void handleRequest(String requestMethod) {
        if (requestMethod == null || requestMethod.equals("")) {
            throw new IllegalArgumentException("requestMethod should be not empty...");
        }
        // 条件判断是否是属于当前Handler的处理范围之内，不是则向下传递Handler处理器
        if (METHOD_DELETE.equals(requestMethod)) {
            // 假设这里是处理的业务逻辑代码
            System.out.println("execute to " + requestMethod + " request");
        }
    }
}
