package com.scut.creational.builderPattern;

/**
 * @author zr
 * @date 2023/10/13
 */

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "ChickenBurger";
    }

    @Override
    public float price() {
        return 26.0f;
    }
}
