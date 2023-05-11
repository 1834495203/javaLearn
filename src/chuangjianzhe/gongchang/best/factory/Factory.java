package chuangjianzhe.gongchang.best.factory;

import chuangjianzhe.gongchang.best.coffee.Coffee;
import chuangjianzhe.gongchang.best.dessert.Dessert;

/**
 * 抽象工厂(Abstract Factory):
 * 本节要介绍的抽象工厂模式将考虑多等级产品的生产，将同一个具体工厂所生产的位于不同等级的一组产品称为一个产品族.
 * 是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
 * 抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。
 *
 * 优点:
 *     当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 * 缺点:
 *     当产品族中需要增加一个新的产品时，所有的工厂类都需要进行修改。
 *
 * 使用场景:
 *     当需要创建的对象是一系列相互关联或相互依赖的产品族时，如电器工厂中的电视机、洗衣机、空调等。
 *     系统中有多个产品族，但每次只使用其中的某一族产品。如有人只喜欢穿某一个品牌的衣服和鞋。
 *     系统中提供了产品的类库，且所有产品的接口相同，客户端不依赖产品实例的创建细节和内部结构。
 * 如:输入法换皮肤，一整套—起换。生成不同操作系统的程序。
 */
public interface Factory {

    Dessert createDessert();

    Coffee createCoffee();
}
