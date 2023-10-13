package com.scut.creational.builderPattern;

/**
 * @author zr
 * @date 2023/10/13
 */

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 13.0f;
    }
}
