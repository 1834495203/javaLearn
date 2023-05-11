package chuangjianzhe.gongchang.after;

import chuangjianzhe.gongchang.after.coffee.Coffee;
import chuangjianzhe.gongchang.after.factory.ACoffeeFactory;

public class Client {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        store.setCoffeeFactory(new ACoffeeFactory());
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
