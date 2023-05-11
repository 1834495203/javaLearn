package chuangjianzhe.jiegouxing.daili.jingtai.character;

import chuangjianzhe.jiegouxing.daili.jingtai.function.Function;

/**
 * 火车站类
 */
public class TrainStation implements Function {
    @Override
    public void sell() {
        System.out.println("火车站卖车票中...");
    }
}
