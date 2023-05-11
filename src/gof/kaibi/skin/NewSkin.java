package gof.kaibi.skin;

import gof.kaibi.AbstractSkin;

public class NewSkin extends AbstractSkin {

    @Override
    public void display() {
        System.out.println("show new skin");
    }

    @Override
    public void toRender(int var) {
        if (var == MAX_SIZE)
            System.out.println("ok");
        else System.out.println("i need 100");
    }
}
