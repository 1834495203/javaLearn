package chuangjianzhe.jianzaozhe.product;

import chuangjianzhe.jianzaozhe.Bike;
import chuangjianzhe.jianzaozhe.Builder;

/**
 * 具体的构建者:实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。
 * 在构造过程完成后，提供产品的实例。
 */
public class ABikeBuilder extends Builder {
    @Override
    public void buildFrame() {
        bike.setFrame("设置了A车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("设置了A车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
