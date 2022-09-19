package com.template;

/**
 * @author Janwes
 * @version 1.0
 * @package com.template
 * @date 2021/11/4 15:04
 * @description 快递员类
 */
public abstract class PostmanTemplate {

    /**
     * 配送流程
     * 此方法修饰为final，子类不可重写，防止改变流程
     */
    protected final void sendFollow() {
        prepare(); // 配送准备
        callContact(); // 联系收货人
        if (isSign()) { // 是否签收
            customerSign(); // 客户签收
        } else {
            refuse(); // 拒签
        }
    }

    protected void prepare() {
        System.out.println("===> 快递已到达，准备配送...");
    }

    /**
     * 抽象方法，子类必须实现重写该方法
     * 联系收货人
     */
    protected abstract void callContact();

    /**
     * 钩子方法
     * 是否签收
     *
     * @return
     */
    protected boolean isSign() {
        return true;
    }

    /**
     * 签收流程
     * 具体方法
     */
    protected void customerSign() {
        System.out.println("===> 客户已签收，上报系统...");
    }

    /**
     * 拒签流程
     */
    protected void refuse() {
    }
}
