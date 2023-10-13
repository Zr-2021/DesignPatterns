package com.scut.creational.singleTonPattern;

/**
 * 饿汉式单例
 * @author zr
 * @date 2023/10/13
 */

public class singleTonHungry {
    private static singleTonHungry instance = new singleTonHungry();
    private singleTonHungry(){
    }
    public static singleTonHungry getInstance(){
        return instance;
    }
}
