package gof.kaibi.yilaidaozhuan.after.assembly;

import gof.kaibi.yilaidaozhuan.after.component.Memory;

public class AMemory implements Memory {
    @Override
    public String getVersion() {
        return "A Memory";
    }

    @Override
    public void save() {
        System.out.println("使用A Memory进行保存");
    }
}
