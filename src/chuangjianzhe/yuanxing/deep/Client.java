package chuangjianzhe.yuanxing.deep;

import java.io.*;

/**
 * 深克隆 通过序列化反序列化实现
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Order order = new Order();
        Address address = new Address();

        address.setFrom("成都");
        address.setTo("北京");

        order.setAddress(address);
        order.setName("裴橘");
        order.setOid(1);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\learn\\javaLearn\\src\\chuangjianzhe\\yuanxing\\deep\\obj.txt"));
        oos.writeObject(order);
        oos.close();

        //读取对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\learn\\javaLearn\\src\\chuangjianzhe\\yuanxing\\deep\\obj.txt"));
        Order order2 = (Order) ois.readObject();
        ois.close();

        address.setFrom("深圳");
        address.setTo("上海");

        order.display();
        order2.display();
    }
}
