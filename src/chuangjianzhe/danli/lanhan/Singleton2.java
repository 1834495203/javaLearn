package chuangjianzhe.danli.lanhan;

/**
 * 懒汉式
 * 静态内部类方式
 * 静态内部类单例模式中实例由内部类创建，
 * 由于JVM在加载外部类的过程中，是不会加载静态内部类的,只有内部类的属性/方法被调用时才会被加载，并初始化其静态属性。
 * 静态属性由于被static修饰，保证只被实例化一次，并且严格保证实例化顺序。
 *
 * 静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。
 * 在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 */
public class Singleton2 {

    //私有构造方法
    private Singleton2(){}

    //定义一个静态内部类
    public static class SingletonHolder{
        //在内部声明并初始化外部类的对象
        @SuppressWarnings("all")
        private final static Singleton2 INSTANCE = new Singleton2();
    }

    //提供公共的访问方式
    public static Singleton2 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
