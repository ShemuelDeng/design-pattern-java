package com.shemuel.singleton;

/**
 * 静态内部类方式
 * 线程安全
 * @author dengsx
 * @create 2024/05/23
 **/
public class SingletonInnerClass {
    private static class SingletonHolder{
        private static SingletonInnerClass instance = new SingletonInnerClass();
    }

    private SingletonInnerClass(){}

    public static SingletonInnerClass getInstance(){
        return SingletonHolder.instance;
    }
}
