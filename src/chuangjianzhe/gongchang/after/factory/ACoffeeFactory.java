package chuangjianzhe.gongchang.after.factory;

import chuangjianzhe.gongchang.after.coffee.ACoffee;
import chuangjianzhe.gongchang.after.coffee.Coffee;

/**
 * A类咖啡工厂,专门生产A类咖啡
 */
public class ACoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new ACoffee();
    }
}
