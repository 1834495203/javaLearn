package gof.kaibi;

/**
 * AbstractSkin定义了皮肤基本的框架
 * 通过继承该抽象类来拓展皮肤的样式
 */

public abstract class AbstractSkin {

    public static final int MAX_SIZE;

    static {
        MAX_SIZE = 100;
    }

    public abstract void display();

    public abstract void toRender(int var);
}
