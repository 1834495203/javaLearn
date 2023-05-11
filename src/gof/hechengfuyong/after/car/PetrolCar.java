package gof.hechengfuyong.after.car;

import gof.hechengfuyong.after.color.Color;
import gof.hechengfuyong.after.color.Green;
import gof.hechengfuyong.after.function.Car;

public class PetrolCar extends Car {

    @Override
    public void run() {
        System.out.println(getColor().getColor()+"的petrol car is running");
    }

    @Override
    public Color getColor() {
        return new Green();
    }
}
