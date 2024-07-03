package com.shemuel.builder;

/**
 * 抽象建造者
 */
public abstract class BurgerBuilder {
    /**
     * 需要构建的产品对象
     */
    protected Burger burger;

    public Burger build() {
        return burger;
    }

    public BurgerBuilder builder() {
        burger = new Burger();
        return this;
    }

    public abstract BurgerBuilder buildBun();
    public abstract BurgerBuilder buildPatty();
    public abstract BurgerBuilder buildLettuce();
    public abstract BurgerBuilder buildCheese();
}