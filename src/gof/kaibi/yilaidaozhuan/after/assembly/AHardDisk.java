package gof.kaibi.yilaidaozhuan.after.assembly;

import gof.kaibi.yilaidaozhuan.after.component.HardDisk;

public class AHardDisk implements HardDisk {
    @Override
    public void save(String var) {
        System.out.println("保存的数据为:"+var);
    }

    @Override
    public String getData() {
        return "sissy";
    }

    @Override
    public String getVersion() {
        return "A HardDisk";
    }
}
