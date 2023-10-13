package com.scut.creational.FactoryPattern;

/**
 * @author zr
 * @date 2023/10/12
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory.getShape("rectangle").draw();

        ShapeFactory.getShape("square").draw();

        ShapeFactory.getShape("circle").draw();
        /*
        矩形
        正方形
        圆形
         */
        ShapeFactory.getShapeByReflection("com.scut.creational.FactoryPattern.Rectangle").draw();
        /*
        矩形
         */
    }
}
