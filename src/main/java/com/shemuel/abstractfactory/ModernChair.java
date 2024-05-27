package com.shemuel.abstractfactory;

/**
 * @author dengsx
 * @create 2024/05/27
 **/
public class ModernChair implements IChair{
    public void sitOn()
    {
        System.out.println("现代化的椅子，坐着更舒服");
    }

    public void hasLegs()
    {
        System.out.println("现代化的椅子，只有两条腿");
    }
}
