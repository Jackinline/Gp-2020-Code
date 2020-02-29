package gp.factory.Test;

import gp.factory.domain.Alipay;
import gp.factory.domain.PayPal;
import gp.factory.AlipayFactory;
import gp.factory.OutsidePayFactory;
import gp.factory.PayFactory;
import gp.factory.PayPalFactory;

public class Test {
    public static void main(String[] args) {
        //Р§зг1
        PayFactory factory= new AlipayFactory();
        Alipay pay = (Alipay) factory.createPay();
        pay.setToAlipayUserId("111111");
        pay.setFormAlipayUserId("2222222222");

        //Р§зг2
        OutsidePayFactory outFactory= new PayPalFactory();
        PayPal payPal = (PayPal) outFactory.createPay();
        payPal.setFormPayPalUserId(1111111111L);
        payPal.setToPayPalUserId(222222222222L);


    }
}
