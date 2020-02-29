package gp.factory.domain;

public class WeChatPay extends Pay {

    private Long  formWeChatId;
    private Long  ToAWeChatId;

    public Long getFormWeChatId() {
        return formWeChatId;
    }

    public void setFormWeChatId(Long formWeChatId) {
        this.formWeChatId = formWeChatId;
    }

    public Long getToAWeChatId() {
        return ToAWeChatId;
    }

    public void setToAWeChatId(Long toAWeChatId) {
        ToAWeChatId = toAWeChatId;
    }
}
