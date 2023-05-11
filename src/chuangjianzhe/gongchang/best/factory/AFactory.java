package chuangjianzhe.gongchang.best.factory;

import chuangjianzhe.gongchang.best.coffee.ACoffee;
import chuangjianzhe.gongchang.best.coffee.Coffee;
import chuangjianzhe.gongchang.best.dessert.ADessert;
import chuangjianzhe.gongchang.best.dessert.Dessert;

/**
 * 具体工厂(Concrete Factory)
 * A类产品生产工厂
 */
public class AFactory implements Factory{
    @Override
    public Dessert createDessert() {
        return new ADessert();
    }

    @Override
    public Coffee createCoffee() {
        return new ACoffee();
    }
}
