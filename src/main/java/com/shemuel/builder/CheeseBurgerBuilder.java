package com.shemuel.builder;

/**
 * 奶酪汉堡构建者
 * @author dengsx
 * @create 2024/07/03
 **/
public class CheeseBurgerBuilder extends BurgerBuilder{
    @Override
    public BurgerBuilder buildBun() {
        System.out.println("构建奶酪汉堡的面包");
        burger.setBun("构建奶酪汉堡的面包");
        return this;
    }

    @Override
    public BurgerBuilder buildPatty() {
        System.out.println("奶酪汉堡不使用肉饼");
        burger.setPatty("奶酪汉堡不使用肉饼");
        return this;
    }

    @Override
    public BurgerBuilder buildLettuce() {
        System.out.println("构建奶酪汉堡的生菜");
        burger.setLettuce("构建奶酪汉堡的生菜");
        return this;
    }

    @Override
    public BurgerBuilder buildCheese() {
        System.out.println("构建奶酪汉堡的奶酪");

        burger.setCheese("构建奶酪汉堡的奶酪");
        return this;
    }
}
