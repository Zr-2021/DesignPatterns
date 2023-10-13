package com.scut.creational.builderPattern;

/**
 * @author zr
 * @date 2023/10/13
 */

public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
