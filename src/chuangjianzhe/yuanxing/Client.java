package chuangjianzhe.yuanxing;

/**
 * 原型模式:
 *     用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型对象相同的新对象。
 * 浅克隆:
 *     创建一个新对象，新对象的属性和原来对家完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 * 使用场景:
 *     对象的创建非常复杂，可以使用原型模式快捷的创建对象。
 *     性能和安全要求比较高。
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("玛瑞斯");

        Person clonePerson = person.clone();
        clonePerson.setName("裴橘");

        person.toDo();
        clonePerson.toDo();
    }
}
