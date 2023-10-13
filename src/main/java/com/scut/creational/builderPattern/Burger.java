package com.scut.creational.builderPattern;

/**
 * @author zr
 * @date 2023/10/13
 */

public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
