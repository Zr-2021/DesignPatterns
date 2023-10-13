package com.scut.creational.builderPattern;

/**
 * @author zr
 * @date 2023/10/13
 */

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 15.3f;
    }
}
