package gp.proxy.dynamicproxy.gpproxy.client;

/**
 * Created by Tom.
 */
public class Zhangsan implements IPerson {

    public void findLove() {
        System.out.println("张三要求：肤白貌美大长腿");
    }

    public void buyInsure() {
        System.out.println("30万");
    }

    public void paramMethod(String str, Integer i) {
        System.out.println("String:" + str + " i:" + i);
    }

}
