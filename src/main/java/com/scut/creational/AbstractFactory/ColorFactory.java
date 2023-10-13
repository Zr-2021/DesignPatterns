package com.scut.creational.AbstractFactory;

import com.scut.utils.ConstantUtils;

/**
 * 具体工厂
 * @author zr
 * @date 2023/10/12
 */

public class ColorFactory extends AbstractFactory{
    public ColorFactory() {
    }

    @Override
    public Shape getShape(String name){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color==null) return null;
        if (color.equalsIgnoreCase(ConstantUtils.RED)){
            return new Red();
        }else if (color.equalsIgnoreCase(ConstantUtils.GREEN)){
            return new Green();
        }else if (color.equalsIgnoreCase(ConstantUtils.BLUE)){
            return new Blue();
        }
        return null;
    }
}
