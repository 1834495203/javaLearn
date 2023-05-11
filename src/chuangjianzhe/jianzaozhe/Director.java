package chuangjianzhe.jianzaozhe;

import java.lang.reflect.InvocationTargetException;

/**
 * 指挥者类
 * 下面示例是Builder模式的常规用法，指挥者类Director在建造者模式中具有很重要的作用，
 * 它用于指导具体构建者如何构建产品，控制调用先后次序，并向调用者返回完整的产品类，
 * 但是有些情况下需要简化系统结构，可以把指挥者类和抽象建造者进行结合
 */
public class Director {

    private final Class<? extends Builder> builder;

    public Director(Class<? extends Builder> builder){
        this.builder = builder;
    }

    public Bike construct() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Builder builder = this.builder.getDeclaredConstructor().newInstance();
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
