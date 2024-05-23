package com.shemuel.factory;

/**
 * @author dengsx
 * @create 2024/05/23
 **/
public class FactoryPatternApp {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape(1).draw();
        factory.getShape(2).draw();
    }
}
