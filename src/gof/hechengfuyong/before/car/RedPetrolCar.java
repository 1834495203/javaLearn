package gof.hechengfuyong.before.car;

import gof.hechengfuyong.before.function.Car;

public class RedPetrolCar implements Car {
    @Override
    public void move() {
        display();
        System.out.println("red petrol car is running");
    }

    private void display(){
        System.out.println("painting the red");
    }
}
