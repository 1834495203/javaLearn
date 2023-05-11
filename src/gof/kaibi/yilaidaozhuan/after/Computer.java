package gof.kaibi.yilaidaozhuan.after;

import gof.kaibi.yilaidaozhuan.after.component.Cpu;
import gof.kaibi.yilaidaozhuan.after.component.HardDisk;
import gof.kaibi.yilaidaozhuan.after.component.Memory;

public class Computer {

    private Cpu cpu;
    private HardDisk hardDisk;
    private Memory memory;

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setMemory(Memory memory) {
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
