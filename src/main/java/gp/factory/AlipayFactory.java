package gp.factory;

import gp.domain.Alipay;

public class AlipayFactory implements InsidePayFactory {
    public Alipay createPay() {
        return new Alipay();
    }
}
