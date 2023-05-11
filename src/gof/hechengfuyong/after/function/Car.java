package gof.hechengfuyong.after.function;

import gof.hechengfuyong.after.color.Color;

public abstract class Car {

    public abstract Color getColor();

    public void run(){
        System.out.println("car is running");
    }
}
