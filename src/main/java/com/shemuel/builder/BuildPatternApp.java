package com.shemuel.builder;

/**
 * 客户端类
 * @author dengsx
 * @create 2024/07/03
 **/
public class BuildPatternApp {
    public static void main(String[] args) {
        BurgerDirector burgerDirector = new BurgerDirector();

        Burger burger = burgerDirector.buildBurger(new MeatBurgerBuilder());

        Burger burger1 = burgerDirector.buildBurger(new CheeseBurgerBuilder());

    }
}
