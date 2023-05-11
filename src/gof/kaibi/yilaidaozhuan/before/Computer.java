package gof.kaibi.yilaidaozhuan.before;

public class Computer {

    private ACpu cpu;
    private AHardDisk hardDisk;
    private AMemory memory;

    public ACpu getCpu() {
        return cpu;
    }

    public void setCpu(ACpu cpu) {
        this.cpu = cpu;
    }

    public AHardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(AHardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public AMemory getMemory() {
        return memory;
    }

    public void setMemory(AMemory memory) {
        this.memory = memory;
    }

    public void run(){
        System.out.println("运行计算机");
        cpu.run();
        hardDisk.save("sissy");
        System.out.println("获取的数据:"+hardDisk.getData());
        memory.save();
    }
}
