package com.shemuel.singleton;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 懒汉式线双重检查锁版
 * @author dengsx
 * @create 2024/05/23
 **/
public class SingletonLazyDuobleCheck {

   private static volatile SingletonLazyDuobleCheck instance = null;

   private SingletonLazyDuobleCheck(){
      System.out.println("实例化了单例对象");
   }

   public static SingletonLazyDuobleCheck getInstance(){
      if (instance == null){
         synchronized (SingletonLazyThreadSafe.class){
            if (instance == null){
               instance = new SingletonLazyDuobleCheck();
            }
         }
      }
      return instance;
   }

   // 输出一个： 实例化了单例对象
   public static void main(String[] args) {
      ExecutorService executor = Executors.newFixedThreadPool(3);

      for (int i = 0; i < 2; i++) {
         executor.execute(()-> {
            SingletonLazyDuobleCheck instance = SingletonLazyDuobleCheck.getInstance();
         });
      }
   }
}
