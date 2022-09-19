package com.template;

/**
 * @author Janwes
 * @version 1.0
 * @package com.template
 * @date 2021/11/4 15:23
 * @description
 */
public class PostmanA extends PostmanTemplate {
    @Override
    protected void callContact() {
        System.out.println("联系Jack先生，商品配送至门口...");
    }
}
