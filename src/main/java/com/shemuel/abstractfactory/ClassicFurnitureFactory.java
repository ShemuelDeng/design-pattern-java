package com.shemuel.abstractfactory;

/**
 * 角色： 具体产品类
 * 经典家具工厂
 * @author dengsx
 * @create 2024/05/27
 **/
public class ClassicFurnitureFactory implements FurnitureFactory{
    @Override
    public IChair createChair() {
        return new ClassicChair();
    }

    @Override
    public ITable createTable() {
        return new ClassicTable();
    }
}
