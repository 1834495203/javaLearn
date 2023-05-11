package gof.kaibi.yilaidaozhuan.after.assembly;

import gof.kaibi.yilaidaozhuan.after.component.Cpu;

public class ACpu implements Cpu {
    @Override
    public String getVersion() {
        return "A Cpu";
    }

    @Override
    public void run() {
        System.out.println("运行A Cpu");
    }
}
