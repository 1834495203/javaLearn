package gof.jiekougeli.before;

public class ASafetyDoor implements SafetyDoor{
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
