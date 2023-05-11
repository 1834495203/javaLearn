package chuangjianzhe.danli.lanhan;

public class Client {
    public static void main(String[] args) {
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();

        System.out.println(instance1.equals(instance2));
    }
}
