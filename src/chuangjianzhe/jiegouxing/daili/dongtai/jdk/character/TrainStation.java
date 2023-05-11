package chuangjianzhe.jiegouxing.daili.dongtai.jdk.character;

import chuangjianzhe.jiegouxing.daili.dongtai.jdk.function.Function;

/**
 * 火车站类
 */
public class TrainStation implements Function {
    @Override
    public void sell() {
        System.out.println("火车站卖车票中...");
    }

    @Override
    public String getMsg(int code) {
        return "为"+code+"号传递信息";
    }
}
