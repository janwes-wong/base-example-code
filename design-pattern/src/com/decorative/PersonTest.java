package com.decorative;

public class PersonTest {
    public static void main(String[] args) {
        IronMna ironMna = new IronMna(new NormalMan());

        ironMna.eat();
        ironMna.sleep();
        ironMna.fight();
    }
}
