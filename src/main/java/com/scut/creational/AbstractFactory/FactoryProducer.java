package com.scut.creational.AbstractFactory;

import com.scut.utils.ConstantUtils;

/**
 * @author zr
 * @date 2023/10/12
 */

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase(ConstantUtils.SHAPE)){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase(ConstantUtils.COLOR)){
            return new ColorFactory();
        }
        return null;
    }
}
