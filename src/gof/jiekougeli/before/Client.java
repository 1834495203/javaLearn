package gof.jiekougeli.before;

/**
 * 上面的设计我们发现了它存在的问题，
 * A品牌的安全门具有防盗，防水，防火的功能。
 * 现在如果我们还需要再创建一个传智品牌的安全门，而该安全门只具有防盗、防水功能呢?
 * 很显然如果实现safetyDoor接口就违背了接口隔离原则
 */
public class Client {
    public static void main(String[] args) {
        SafetyDoor aSafetyDoor = new ASafetyDoor();

        aSafetyDoor.antiTheft();
        aSafetyDoor.waterProof();
        aSafetyDoor.fireProof();
    }
}
