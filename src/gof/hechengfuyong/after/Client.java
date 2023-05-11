package gof.hechengfuyong.after;

import gof.hechengfuyong.after.car.ElectricalCar;
import gof.hechengfuyong.after.car.PetrolCar;

/**
 * 合成复用原则是指:尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。
 * 通常类的复用分为继承复用和合成复用两种。
 *
 * 继承复用虽然有简单和易实现的优点，但它也存在以下缺点:
 * 1．继承复用破坏了类的封装性。因为继承会将父类的实现细节暴露给子类，父类对子类是透明的，所以这种复用又称为"白箱"复用。
 * 2．子类与父类的耦合度高。父类的实现的任何改变都会导致子类的实现发生变化，这不利于类的扩展与维护。
 * 3．它限制了复用的灵活性。从父类继承而来的实现是静态的，在编译时已经定义，所以在运行时不可能发生变化。
 *
 * 采用组合或聚合复用时，可以将已有对象纳入新对象中，使之成为新对象的一部分，新对象可以调用已有对象的功能，它有以下优点:
 * 1．它维持了类的封装性。因为成分对象的内部细节是新对象看不见的，所以这种复用又称为"黑箱”复用。
 * 2．对象间的耦合度低。可以在类的成员位置声明抽象。
 * 3．复用的灵活性高。这种复用可以在运行时动态进行，新对象可以动态地引用与成分对象类型相同的对象。
 */
public class Client {
    public static void main(String[] args) {
        PetrolCar petrolCar = new PetrolCar();
        ElectricalCar electricalCar = new ElectricalCar();

        petrolCar.run();
        electricalCar.run();
    }
}