package com.scut.creational.AbstractFactory;

import com.scut.utils.ConstantUtils;

/**
 * 具体工厂
 * @author zr
 * @date 2023/10/12
 */

public class ShapeFactory extends AbstractFactory{
    public ShapeFactory() {
    }

    @Override
    public Shape getShape(String name){
        if (name==null) return null;
        if (name.equalsIgnoreCase(ConstantUtils.RECTANGLE)){
            return new Rectangle();
        }else if (name.equalsIgnoreCase(ConstantUtils.SQUARE)){
            return new Square();
        }else if (name.equalsIgnoreCase(ConstantUtils.CIRCLE)){
            return new Circle();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
