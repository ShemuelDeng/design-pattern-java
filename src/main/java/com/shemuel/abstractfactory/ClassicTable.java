package com.shemuel.abstractfactory;

/**
 * @author dengsx
 * @create 2024/05/27
 **/
public class ClassicTable implements ITable{
    @Override
    public void storage(String something) {
        System.out.println("古典桌子放了" + something);
    }
}
