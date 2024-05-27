package com.shemuel.abstractfactory;

/**
 * @author dengsx
 * @create 2024/05/27
 **/
public class ModernTable implements ITable{
    @Override
    public void storage(String something) {
        System.out.println("现代化桌子上放了" + something);
    }
}
