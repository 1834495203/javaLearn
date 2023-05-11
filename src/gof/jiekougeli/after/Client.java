package gof.jiekougeli.after;

import gof.jiekougeli.after.door.ASafetyDoor;
import gof.jiekougeli.after.door.BSafetyDoor;

/**
 * 客户端不应该被迫依赖于它不使用的方法;一个类对另一个类的依赖应该建立在最小的接口上。
 */
public class Client {
    public static void main(String[] args) {
        ASafetyDoor aDoor = new ASafetyDoor();
        aDoor.fireProof();
        aDoor.antiTheft();
        aDoor.waterProof();

        System.out.println("-----------------------");

        BSafetyDoor bDoor = new BSafetyDoor();
        bDoor.antiTheft();
        bDoor.fireProof();
    }
}
