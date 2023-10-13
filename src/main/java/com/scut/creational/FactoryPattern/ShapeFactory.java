package com.scut.creational.FactoryPattern;

import com.scut.utils.ConstantUtils;

/**
 * 具体工厂
 * @author zr
 * @date 2023/10/12
 */

public class ShapeFactory {
    public ShapeFactory() {
    }

    public static Shape getShape(String name){
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

    //上面新增接口实现类的时候需要扩展getShape方法，利用反射实现实例创建
    public static Shape getShapeByReflection(String className){
        Shape instance = null;
        try{
            instance = (Shape)Class.forName(className).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return instance;
    }
}
