package gp.factory;

import gp.factory.domain.PayPal;

public class PayPalFactory implements  OutsidePayFactory {

    public PayPal createPay() {
        return new PayPal();
    }

}
