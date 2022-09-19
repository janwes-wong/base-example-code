package com.template;

/**
 * @author Janwes
 * @version 1.0
 * @package com.template
 * @date 2021/11/4 15:29
 * @description
 */
public class PostmanB extends PostmanTemplate {

    @Override
    protected void callContact() {
        System.out.println("联系Lucy女士，商品配送至门口...");
    }

    @Override
    protected boolean isSign() {
        return false;
    }

    @Override
    protected void refuse() {
        System.out.println("===> 商品不符，拒绝签收...");
    }
}
