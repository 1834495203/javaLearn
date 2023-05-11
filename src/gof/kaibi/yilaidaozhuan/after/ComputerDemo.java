package gof.kaibi.yilaidaozhuan.after;

import gof.kaibi.yilaidaozhuan.after.assembly.ACpu;
import gof.kaibi.yilaidaozhuan.after.assembly.AMemory;
import gof.kaibi.yilaidaozhuan.after.assembly.AHardDisk;
import gof.kaibi.yilaidaozhuan.after.component.Cpu;
import gof.kaibi.yilaidaozhuan.after.component.HardDisk;
import gof.kaibi.yilaidaozhuan.after.component.Memory;

/**
 * 高层模块不应该依赖低层模块，两者都应该依赖其抽象;
 * 抽象不应该依赖细节，细节应该依赖抽象。
 * 简单的说就是要求对抽象进行编程(cpu, hardDisk, Memory接口)，不要对实现进行编程，这样就降低了客户与实现模块间的耦合。
 */
public class ComputerDemo {
    public static void main(String[] args) {

        Computer computer = new Computer();

        //创建组件
        System.out.println("使用组件的版本");
        Cpu cpu = new ACpu();
        System.out.println(cpu.getVersion());

        HardDisk hardDisk = new AHardDisk();
        System.out.println(hardDisk.getVersion());

        Memory memory = new AMemory();
        System.out.println(memory.getVersion());

        System.out.println("-------------------------------");

        //组装
        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        computer.run();
    }
}
