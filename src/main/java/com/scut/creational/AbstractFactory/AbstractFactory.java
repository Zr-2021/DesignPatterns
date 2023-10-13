package com.scut.creational.AbstractFactory;

/**
 * @author zr
 * @date 2023/10/12
 */

public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
