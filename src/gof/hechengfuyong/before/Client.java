package gof.hechengfuyong.before;

import gof.hechengfuyong.before.car.PetrolCar;
import gof.hechengfuyong.before.car.RedPetrolCar;
import gof.hechengfuyong.before.function.Car;

/**
 * 从上面类图我们可以看到使用继承复用产生了很多子类，如果现在又有新的动力源或者新的颜色的话，就需要再定义新的类。
 * 我们试着将继承复用改为聚合复用看一下。
 */
public class Client {
    public static void main(String[] args) {
        Car redCar = new RedPetrolCar();
        PetrolCar car = new PetrolCar();

        redCar.move();
        car.move();
    }
}
