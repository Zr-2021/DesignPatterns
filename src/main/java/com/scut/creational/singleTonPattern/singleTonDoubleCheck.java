package com.scut.creational.singleTonPattern;

/**
 * 双检查单例
 * @author zr
 * @date 2023/10/13
 */

public class singleTonDoubleCheck {
    private volatile static singleTonDoubleCheck singleTonDoubleCheck;
    private singleTonDoubleCheck(){}
    public static singleTonDoubleCheck getInstance(){
        if (singleTonDoubleCheck != null){
            synchronized (singleTonDoubleCheck.class){
                if (singleTonDoubleCheck != null){
                    singleTonDoubleCheck = new singleTonDoubleCheck();
                }
            }
        }
        return singleTonDoubleCheck;
    }
}
