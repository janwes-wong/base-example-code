package com.decorative;


/**
 * IronMna钢铁侠：装饰类
 */
public class IronMna implements Person{
    private NormalMan normalMan;

    public IronMna() {
    }

    public IronMna(NormalMan normalMan) {
        this.normalMan = normalMan;
    }


    @Override
    public void eat() {
        normalMan.eat();
    }

    @Override
    public void sleep() {
        normalMan.sleep();
    }

    @Override
    public void fight() {
        System.out.println("Double Kills & 雷霆出击 & 振金套装 & 科技之神");
    }
}
