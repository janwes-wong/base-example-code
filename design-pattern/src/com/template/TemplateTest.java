package com.template;

/**
 * @author Janwes
 * @version 1.0
 * @package com.template
 * @date 2021/11/4 15:25
 * @description
 */
public class TemplateTest {
    public static void main(String[] args) {
        PostmanA postmanA = new PostmanA();
        postmanA.sendFollow();

        PostmanB postmanB = new PostmanB();
        postmanB.sendFollow();
    }
}
