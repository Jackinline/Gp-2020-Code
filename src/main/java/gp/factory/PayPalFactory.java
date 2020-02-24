package gp.factory;

import gp.domain.PayPal;

public class PayPalFactory implements  OutsidePayFactory {

    public PayPal createPay() {
        return new PayPal();
    }

}
