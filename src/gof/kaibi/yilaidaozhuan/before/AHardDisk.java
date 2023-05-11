package gof.kaibi.yilaidaozhuan.before;

/**
 * 某种硬盘
 */
public class AHardDisk {

    //存储数据的方法
    public void save(String data){
        System.out.println("存储数据为:"+data);
    }

    //获取数据
    public String getData(){
        System.out.println("正在获取数据");
        return "i am obsessed with the ponytail";
    }
}
