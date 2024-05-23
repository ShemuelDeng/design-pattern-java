package com.shemuel.singleton;

/**
 * 饿汉式， 类加载时旧初始化
 * 线程安全
 * @author dengsx
 * @create 2024/05/23
 **/
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}
