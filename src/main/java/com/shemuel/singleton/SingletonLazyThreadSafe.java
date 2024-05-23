package com.shemuel.singleton;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 懒汉式线程安全版
 * @author dengsx
 * @create 2024/05/23
 **/
public class SingletonLazyThreadSafe {

   private static volatile SingletonLazyThreadSafe instance = null;

   private SingletonLazyThreadSafe(){
      System.out.println("实例化了单例对象");
   }

   public static SingletonLazyThreadSafe getInstance(){
      if (instance == null){
         instance = new SingletonLazyThreadSafe();
      }
      return instance;
   }


   public static void main(String[] args) {
      ExecutorService executor = Executors.newFixedThreadPool(3);

      for (int i = 0; i < 2; i++) {
         executor.execute(()-> {
            SingletonLazyThreadSafe instance = SingletonLazyThreadSafe.getInstance();
         });
      }
   }
}
