package gof.jiekougeli.after.door;

import gof.jiekougeli.after.function.AntiTheft;
import gof.jiekougeli.after.function.FireProof;
import gof.jiekougeli.after.function.WaterProof;

public class ASafetyDoor implements AntiTheft, FireProof, WaterProof {
    @Override
    public void antiTheft() {
        System.out.println("实现了防盗功能");
    }

    @Override
    public void fireProof() {
        System.out.println("实现了防火功能");
    }

    @Override
    public void waterProof() {
        System.out.println("实现了防水功能");
    }
}
