package com.shemuel.factory;

/**
 * 图形工厂
 * @author dengsx
 * @create 2024/05/23
 **/
public class ShapeFactory {

    public Shape getShape(int type){
        if (type == 1){
            return new Rectangle();
        }
        if (type == 2){
            return new Square();
        }
        throw new RuntimeException("不支持的形状类型" + type);
    }
}
