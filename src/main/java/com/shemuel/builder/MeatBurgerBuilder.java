package com.shemuel.builder;

/**
 * @author dengsx
 * @create 2024/07/03
 **/
public class MeatBurgerBuilder extends BurgerBuilder{
    @Override
    public BurgerBuilder buildBun() {
        System.out.println("构建肉汉堡的面包");
        burger.setBun("构建肉汉堡的面包");
        return this;
    }

    @Override
    public BurgerBuilder buildPatty() {
        System.out.println("构建肉汉堡的肉饼");
        burger.setPatty("构建肉汉堡的肉饼");
        return this;
    }

    @Override
    public BurgerBuilder buildLettuce() {
        System.out.println("构建肉汉堡的蔬菜");
        burger.setLettuce("构建肉汉堡的蔬菜");
        return this;
    }

    @Override
    public BurgerBuilder buildCheese() {
        System.out.println("肉汉堡不使用奶酪");
        build().setCheese("肉汉堡不使用奶酪");
        return this;
    }
}
