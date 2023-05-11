package chuangjianzhe.danli.breaking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 序列化反序列化 会破坏单例模式
 * 反射 会破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws Exception{
        write2File();
        readFile();
        readFile();

        /*
          反射能破环单例模式
          chuangjianzhe.danli.breaking.Singleton@1b6d3586
          chuangjianzhe.danli.breaking.Singleton@4554617c
         */
//        refection();
    }

    public static void readFile() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\learn\\javaLearn\\src\\chuangjianzhe\\danli\\breaking\\test.txt"));
        Singleton instance = (Singleton) ois.readObject();
        instance.printNum();
        ois.close();
    }

    public static void write2File() throws Exception{
        Singleton instance = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\learn\\javaLearn\\src\\chuangjianzhe\\danli\\breaking\\test.txt"));
        oos.writeObject(instance);
        oos.close();
    }

    public static void refection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取Singleton的字节码对象
        Class<Singleton> aClass = Singleton.class;
        //获取无参构造方法对象
        Constructor<Singleton> constructor = aClass.getDeclaredConstructor();
        //取消访问检查
        constructor.setAccessible(true);
        //创建Singleton对象
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
