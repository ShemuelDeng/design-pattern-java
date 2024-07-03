package com.shemuel.builder;

/**
 * 指挥者，只负责创建产品的顺序和方式
 *
 * @author dengsx
 * @create 2024/07/03
 **/
public class BurgerDirector {

    public Burger buildBurger(BurgerBuilder burgerBuilder){
        Burger build = burgerBuilder.builder()
                .buildBun()
                .buildLettuce()
                .buildPatty()
                .buildCheese().build();
        System.out.println("指挥者构建好了一个汉堡产品：" + build.toString());
        return build;
    }

}
