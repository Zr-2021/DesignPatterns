package com.scut.creational.singleTonPattern;

/**
 * 静态内部类单例
 * @author zr
 * @date 2023/10/13
 */

public class singleTonInnerClass {
    private static class singleTonInnerClassHolder{
        private static final singleTonInnerClass instance = new singleTonInnerClass();
    }
    private singleTonInnerClass(){}
    public static singleTonInnerClass getInstance(){
        return singleTonInnerClassHolder.instance;
    }
}
