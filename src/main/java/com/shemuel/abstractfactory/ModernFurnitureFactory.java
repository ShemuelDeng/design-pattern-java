package com.shemuel.abstractfactory;

/**
 * @author dengsx
 * @create 2024/05/27
 **/
public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public IChair createChair() {
        return new ModernChair()   ;
    }

    @Override
    public ITable createTable() {
        return new ModernTable();
    }
}
