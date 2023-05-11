package chuangjianzhe.danli.ehan;

/**
 * 饿汉式
 * 枚举类型实现
 */
public enum Singleton3 {

    INSTANCE;

    public void test(){
        System.out.println("我的世界");
    }
}
