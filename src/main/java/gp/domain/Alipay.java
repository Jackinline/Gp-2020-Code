package gp.domain;

public class Alipay extends Pay {

    private String formAlipayUserId;
    private String ToAlipayUserId;

    public String getFormAlipayUserId() {
        return formAlipayUserId;
    }

    public void setFormAlipayUserId(String formAlipayUserId) {
        this.formAlipayUserId = formAlipayUserId;
    }

    public String getToAlipayUserId() {
        return ToAlipayUserId;
    }

    public void setToAlipayUserId(String toAlipayUserId) {
        ToAlipayUserId = toAlipayUserId;
    }
}
