package chuangjianzhe.danli.ehan;

/**
 * 单例模式(singleton Pattern)是Java中最简单的设计模式之一。
 * 这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
 * 这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 */
public class Client {
    public static void main(String[] args) {
        singleton();
        System.out.println("--------------------------");
        singleton2();
        System.out.println("--------------------------");
        singleton3();
    }

    public static void singleton(){
        Singleton instance = Singleton.getInstance();

        instance.change();
        System.out.println(instance.getTest()); //20

        Singleton singleton = Singleton.getInstance();

        singleton.change();
        System.out.println(singleton.getTest()); //30
    }

    public static void singleton2(){
        Singleton2 instance = Singleton2.getInstance();

        instance.change();
        System.out.println(instance.getTest()); //20

        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.change();
        System.out.println(singleton2.getTest()); //30
    }

    public static void singleton3(){
        Singleton3 instance = Singleton3.INSTANCE;

        instance.test();    //我的世界
    }
}
