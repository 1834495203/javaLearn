package gof.kaibi.yilaidaozhuan.before;

/**
 * 代码可以看到已经组装了一台电脑,
 * 但是似乎组装的电脑的cpu只能是Intel的，内存条只能是金士顿的，硬盘只能是希捷的,
 * 这对用户肯定是不友好的，用户有了机箱肯定是想按照自己的喜好，选择自己喜欢的配件。
 */
public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.setCpu(new ACpu());
        computer.setHardDisk(new AHardDisk());
        computer.setMemory(new AMemory());

        computer.run();
    }
}
