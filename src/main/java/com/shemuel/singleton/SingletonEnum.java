package com.shemuel.singleton;

/**
 * 枚举的方式实现
 * 线程安全
 * @author dengsx
 * @create 2024/05/23
 **/
public enum SingletonEnum {
    INSTANCE;

    public void someMethod(){
        System.out.println("someMethod called");
    }

    public static void main(String[] args) {
        SingletonEnum.INSTANCE.someMethod();
    }
}
