package gof.kaibi.skin;

import gof.kaibi.AbstractSkin;

public class DefaultSkin extends AbstractSkin {

    @Override
    public void display() {
        System.out.println("show default skin");
    }

    @Override
    public void toRender(int var) {
        if (var == MAX_SIZE*2)
            System.out.println("ok");
        else System.out.println("i need 200");
    }
}
