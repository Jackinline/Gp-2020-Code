package gp.factory;

import gp.factory.domain.WeChatPay;

public class WeChatPayFactory implements  InsidePayFactory {

    public WeChatPay createPay() {
        return new WeChatPay();
    }
}
