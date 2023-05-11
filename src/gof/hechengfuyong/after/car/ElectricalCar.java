package gof.hechengfuyong.after.car;

import gof.hechengfuyong.after.color.Color;
import gof.hechengfuyong.after.color.Red;
import gof.hechengfuyong.after.function.Car;

public class ElectricalCar extends Car {
    @Override
    public Color getColor() {
        return new Red();
    }

    @Override
    public void run() {
        System.out.println(getColor().getColor()+"的electrical car is running");
    }
}
