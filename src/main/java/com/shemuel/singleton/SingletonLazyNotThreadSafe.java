package com.shemuel.singleton;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 懒汉式线程不安全版
 * @author dengsx
 * @create 2024/05/23
 **/
public class SingletonLazyNotThreadSafe {

   private static  SingletonLazyNotThreadSafe instance = null;

   private SingletonLazyNotThreadSafe(){
      System.out.println("实例化了单例对象");
   }

   public static SingletonLazyNotThreadSafe getInstance(){
      synchronized (SingletonLazyThreadSafe.class){
         if (instance == null){
            instance = new SingletonLazyNotThreadSafe();
         }
      }
      return instance;
   }

   // 输出一个： 实例化了单例对象
   public static void main(String[] args) {
      ExecutorService executor = Executors.newFixedThreadPool(3);

      for (int i = 0; i < 2; i++) {
         executor.execute(()-> {
            SingletonLazyNotThreadSafe instance = SingletonLazyNotThreadSafe.getInstance();
         });
      }
   }
}
