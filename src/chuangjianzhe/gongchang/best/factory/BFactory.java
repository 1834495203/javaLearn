package chuangjianzhe.gongchang.best.factory;

import chuangjianzhe.gongchang.best.coffee.BCoffee;
import chuangjianzhe.gongchang.best.coffee.Coffee;
import chuangjianzhe.gongchang.best.dessert.BDessert;
import chuangjianzhe.gongchang.best.dessert.Dessert;

/**
 * 具体工厂(Concrete Factory)
 * B类产品生产工厂
 */
public class BFactory implements Factory{
    @Override
    public Dessert createDessert() {
        return new BDessert();
    }

    @Override
    public Coffee createCoffee() {
        return new BCoffee();
    }
}
