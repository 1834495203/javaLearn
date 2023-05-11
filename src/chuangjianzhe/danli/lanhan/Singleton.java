package chuangjianzhe.danli.lanhan;

/**
 * 懒汉式:类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建
 * 双重检查锁模式
 *
 * 双重检查锁模式是一种非常好的单例实现模式，解决了单例、性能、线程安全问题，
 * 上面的双重检测锁模式看上去完美无缺，其实是存在问题，
 * 在多线程的情况下，可能会出现空指针问题，出现问题的原因是JM在实例化对象的时候会进行优化和指令重排序操作。
 */
public class Singleton {

    //私有构造方法
    private Singleton(){}

    // 声明Singleton类型的变量
    // 要解决双重检查锁模式带来空指针异常的问题，只需要使用volatile关键字，
    // volatile关键字可以保证可见性和有序性。
    private static volatile Singleton instance;

    //对外提供访问方式
    //synchronized 关键字为同步 线程安全
    public static Singleton getInstance(){
        //先判断instance是否为null,如果为null则还没有创建instance

        //第一次判断,如果instance的值不为null,不需要抢占,直接返回对象
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
