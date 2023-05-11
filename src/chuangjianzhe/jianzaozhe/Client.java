package chuangjianzhe.jianzaozhe;

import chuangjianzhe.jianzaozhe.product.ABikeBuilder;

import java.lang.reflect.InvocationTargetException;

/**
 * 建造者(Builder)模式创建的是复杂对象，其产品的各个部分经常面临着剧烈的变化，但将它们组合在一起的算法却相对稳定，所以它通常在以下场合使用。
 *     创建的对象较复杂，由多个部件构成，各部件面临着复杂的变化，但构件间的建造顺序是稳定的。
 *     创建复杂对象的算法独立于该对象的组成部分以及它们的装配方式，即产品的构建过程和最终的表示是独立的。
 */
public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Director director = new Director(ABikeBuilder.class);
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());

        reBuild();
    }

    public static void reBuild(){
        Bike builder = new Bike.Builder()
                .frame("设置新的车架")
                .seat("设置新的车座")
                .build();

        System.out.println(builder.getSeat());
        System.out.println(builder.getFrame());
    }
}
