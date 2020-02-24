package gp.domain;

public class UnionPay extends Pay {
    private Long fromBankId;

    private String fromUserId;

    private Long toBankId;

    private String toUserId;

    public Long getFromBankId() {
        return fromBankId;
    }

    public void setFromBankId(Long fromBankId) {
        this.fromBankId = fromBankId;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(String fromUserId) {
        this.fromUserId = fromUserId;
    }

    public Long getToBankId() {
        return toBankId;
    }

    public void setToBankId(Long toBankId) {
        this.toBankId = toBankId;
    }

    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }
}
