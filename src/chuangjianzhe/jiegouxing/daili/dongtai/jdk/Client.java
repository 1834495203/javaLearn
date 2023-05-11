package chuangjianzhe.jiegouxing.daili.dongtai.jdk;

import chuangjianzhe.jiegouxing.daili.dongtai.jdk.function.Function;
import chuangjianzhe.jiegouxing.daili.dongtai.jdk.user_proxy.ProxyFactory;

public class Client {
    public static void main(String[] args) {
        Function proxyObj = ProxyFactory.getProxyObj();
        System.out.println(proxyObj.getMsg(100));
    }
}
