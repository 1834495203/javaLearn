package chuangjianzhe.danli.ehan;

/**
 * 饿汉式:类加载就会导致该单实例对象被创建
 * 方式:静态成员变量
 */
public class Singleton {

    private int test = 10;

    public int getTest() {
        return test;
    }

    //私有构造方法
    private Singleton(){}

    //在本类中创建本类的对象
    @SuppressWarnings("all")
    private static final Singleton instance = new Singleton();

    //提供一个公共的访问方式,让外界获取对象
    public static Singleton getInstance(){
        return instance;
    }

    public void change(){
        this.test += 10;
    }
}
