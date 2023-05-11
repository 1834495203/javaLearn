package chuangjianzhe.jiegouxing.daili.jingtai.proxy;

import chuangjianzhe.jiegouxing.daili.jingtai.character.TrainStation;
import chuangjianzhe.jiegouxing.daili.jingtai.function.Function;

/**
 * 代理
 */
public class ProxyPoint implements Function {

    private final TrainStation station = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点接收中...");
        station.sell();
    }
}
