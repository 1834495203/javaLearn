package chuangjianzhe.jiegouxing.daili.dongtai.jdk.user_proxy;

import chuangjianzhe.jiegouxing.daili.dongtai.jdk.character.TrainStation;
import chuangjianzhe.jiegouxing.daili.dongtai.jdk.function.Function;

import java.lang.reflect.Proxy;

/**
 * 获取代理的工厂类
 * 代理类也实现了对应的接口
 */
public class ProxyFactory {

    //声明目标对象
    private static final TrainStation station = new TrainStation();

    private ProxyFactory(){}

    /**
     * 返回代理对象
     */
    public static Function getProxyObj(){
        return (Function) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("代理前...");
                    System.out.println("执行的方法名为: "+method.getName());
                    Object invoke = method.invoke(station, args);
                    System.out.println("代理后...");
                    return invoke;
                }
        );
    }

}
