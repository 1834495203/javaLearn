package chuangjianzhe.yuanxing.deep;

import java.io.Serializable;

public class Order implements Cloneable, Serializable {

    private Integer oid;

    private String name;

    private Address address;

    public void display(){
        System.out.println(oid+"号订单,用户名为"+name+",从"+address.getFrom()+"到"+address.getTo());
    }

    @Override
    protected Order clone() throws CloneNotSupportedException {
        return (Order) super.clone();
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
