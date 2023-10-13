package com.scut.creational.builderPattern;

/**
 * @author zr
 * @date 2023/10/13
 */

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 14.7f;
    }
}
