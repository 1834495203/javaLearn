package gof.jiekougeli.after.door;

import gof.jiekougeli.after.function.AntiTheft;
import gof.jiekougeli.after.function.FireProof;

public class BSafetyDoor implements AntiTheft, FireProof {
    @Override
    public void antiTheft() {
        System.out.println("实现了防盗功能");
    }

    @Override
    public void fireProof() {
        System.out.println("实现了防火功能");
    }
}
