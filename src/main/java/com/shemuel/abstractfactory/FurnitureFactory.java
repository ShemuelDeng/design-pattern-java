package com.shemuel.abstractfactory;

/**
 * 角色： 抽象工厂类
 * 家具工厂
 * @author dengsx
 * @create 2024/05/27
 **/
public interface FurnitureFactory {
    IChair createChair();
    ITable createTable();
}
