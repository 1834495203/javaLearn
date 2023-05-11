package chuangjianzhe.jianzaozhe;

/**
 * 这个接口(或抽象类)规定要实现复杂对象的那些部分的创建，并不涉及具体的部件对象的创建。
 */
public abstract class Builder {

    //声明bike类型的变量, 并进行赋值
    protected Bike bike = new Bike.Builder().build();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
