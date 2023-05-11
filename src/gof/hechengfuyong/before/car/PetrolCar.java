package gof.hechengfuyong.before.car;

import gof.hechengfuyong.before.function.Car;

public class PetrolCar implements Car {
    @Override
    public void move() {
        System.out.println("petrol car is running");
    }
}
