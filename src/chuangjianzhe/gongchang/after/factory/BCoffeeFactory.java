package chuangjianzhe.gongchang.after.factory;

import chuangjianzhe.gongchang.after.coffee.BCoffee;
import chuangjianzhe.gongchang.after.coffee.Coffee;

/**
 * B类咖啡工厂,专门用来生产咖啡
 */
public class BCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new BCoffee();
    }
}
