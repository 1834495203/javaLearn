package chuangjianzhe.gongchang.after;

import chuangjianzhe.gongchang.after.coffee.Coffee;
import chuangjianzhe.gongchang.after.factory.CoffeeFactory;

public class CoffeeStore {

    private CoffeeFactory factory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory){
        this.factory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
