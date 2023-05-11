package chuangjianzhe.danli.ehan;

/**
 * 单例模式:
 * 饿汉式:类加载就会导致该单实例对象被创建
 * 方式:静态代码块方式
 */
public class Singleton2 {

    //私有构造方法
    private Singleton2(){}

    //声明singleton2类型的变量
    private static final Singleton2 instance;

    private int test = 10;

    public int getTest() {
        return test;
    }

    //在静态代码块里赋值
    static {
        instance = new Singleton2();
    }

    //对外提供获取该类对象的方法
    public static Singleton2 getInstance(){
        return instance;
    }

    public void change(){
        this.test += 10;
    }
}
