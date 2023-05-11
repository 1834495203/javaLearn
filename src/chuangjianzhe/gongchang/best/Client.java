package chuangjianzhe.gongchang.best;

import chuangjianzhe.gongchang.best.coffee.Coffee;
import chuangjianzhe.gongchang.best.dessert.Dessert;
import chuangjianzhe.gongchang.best.factory.AFactory;
import chuangjianzhe.gongchang.best.factory.BFactory;
import chuangjianzhe.gongchang.best.factory.Factory;

/**
 * 抽象工厂(Abstract Factory)︰提供了创建产品的接口，它包含多个创建产品的方法，可以创建多个不同等级的产品.
 * 具体工厂(Concrete Factory)︰主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建.
 * 抽象产品(Product)∶定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品.
 * 具体产品(ConcreteProduct)︰实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系.
 */
public class Client {
    public static void main(String[] args) {
        Factory aFactory = new AFactory();
        Factory bFactory = new BFactory();

        Coffee coffee = aFactory.createCoffee();
        Dessert dessert = bFactory.createDessert();

        System.out.println(coffee.getName());
        dessert.display();
    }
}
