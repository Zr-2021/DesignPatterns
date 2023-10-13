package com.scut.creational.AbstractFactory;

/**
 * 具体接口
 * @author zr
 * @date 2023/10/12
 */

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
