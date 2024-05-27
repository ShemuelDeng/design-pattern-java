package com.shemuel.abstractfactory;

/**
 * 客户端类
 * @author dengsx
 * @create 2024/05/27
 **/
public class Application {
    public static void main(String[] args) {
        FurnitureFactory factory = null;

        if ("classic".equals(args[0])) {
            factory = new ClassicFurnitureFactory();
        }
        if ("modern".equals(args[0])){
            factory = new ModernFurnitureFactory();
        }

        if (factory != null){
            IChair chair = factory.createChair();
            chair.sitOn();
            chair.hasLegs();

            ITable table = factory.createTable();
            table.storage("电脑");
        }


    }
}
