package own.agency;

/**
 * @author GLaDOS
 * @date 2023/5/8 21:58
 */
public class Test {

    @Agency(type = Type.BEFORE)
    public void test(){
        System.out.println("我是测试方法");
    }
}
