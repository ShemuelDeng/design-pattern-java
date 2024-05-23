package com.shemuel;

import com.shemuel.singleton.SingletonLazyNotThreadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 程序启动类
 * @author dengsx
 * @create 2024/05/23
 **/
public class App {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(8);

        for (int i = 0; i < 100; i++) {
            executor.execute(()-> {
                SingletonLazyNotThreadSafe instance = SingletonLazyNotThreadSafe.getInstance();
            });
        }
    }
}
