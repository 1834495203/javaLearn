package chuangjianzhe.gongchang.before;

import chuangjianzhe.gongchang.before.type.CCoffee;
import chuangjianzhe.gongchang.before.type.Coffee;

public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("A类咖啡");
        System.out.println(coffee.getName());

        System.out.println("-----------------------------------");

        try {
            Coffee specialCoffee = coffeeStore.orderSpecialCoffee(CCoffee.class);
            System.out.println(specialCoffee.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
