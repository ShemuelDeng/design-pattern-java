package com.shemuel.builder;

/**
 * 产品类
 * 汉堡包
 */
public class Burger {
    /**
     * 面包片
     */
    private String bun;

    /**
     * 肉饼
     */
    private String patty;

    /**
     * 生菜
     */
    private String lettuce;

    /**
     * 芝士 奶酪
     */
    private String cheese;

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Burger with " +
                (bun != null ? bun + " and " : "") +
                (patty != null ? patty + " and " : "") +
                (lettuce != null ? lettuce + " and " : "") +
                (cheese != null ? cheese + " and " : "");
    }
}