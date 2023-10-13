package com.scut.creational.AbstractFactory;

/**
 * @author zr
 * @date 2023/10/12
 */

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("红色的");
    }
}
