package chuangjianzhe.danli.breaking;

import java.io.Serial;
import java.io.Serializable;

/**
 * 懒汉式
 * 静态内部类方式
 * Java中的对象不允许直接通过流写出到磁盘或者管道中，
 * 在Java中的一个对象要想通过对象流进行写出或读入操作，
 * 则这个Java对象必须实现Serializable接口。
 */
public class Singleton implements Serializable {

    private int num = 10;
    private static boolean flag = false;

    //私有构造方法
    private Singleton(){
        //防止反射破坏单例模式
        synchronized (Singleton.class){
            if (flag){
                throw new RuntimeException("不能创建多个对象");
            }
            flag = true;
        }
    }

    //定义一个静态内部类
    public static class SingletonHolder{
        //在内部声明并初始化外部类的对象
        @SuppressWarnings("all")
        private final static Singleton INSTANCE = new Singleton();
    }

    //提供公共的访问方式
    public static Singleton getInstance(){
        return Singleton.SingletonHolder.INSTANCE;
    }

    public void printNum(){
        this.num += 10;
        System.out.println(num);
    }

    /**
     * 当进行反序列化时,会自动调用该方法,该方法的返回值直接返回
     * @return Singleton对象
     */
    @Serial
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
