package gp.factory;

import gp.factory.domain.Alipay;

public class AlipayFactory implements InsidePayFactory {
    public Alipay createPay() {
        return new Alipay();
    }
}
