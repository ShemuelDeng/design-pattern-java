package com.shemuel.abstractfactory;

/**
 * @author dengsx
 * @create 2024/05/27
 **/
public class ClassicChair implements IChair{
    @Override
    public void sitOn() {
        System.out.println("古典椅子，虽然不舒服，也可以坐人");
    }

    @Override
    public void hasLegs() {
        System.out.println("古典椅子，有四条腿");
    }
}
