package gp.factory.domain;

public class PayPal extends Pay {

    private Long fromCountryId;

    private Long formPayPalUserId;

    private Long toCountryId;

    private Long toPayPalUserId;

    public Long getFromCountryId() {
        return fromCountryId;
    }

    public void setFromCountryId(Long fromCountryId) {
        this.fromCountryId = fromCountryId;
    }

    public Long getFormPayPalUserId() {
        return formPayPalUserId;
    }

    public void setFormPayPalUserId(Long formPayPalUserId) {
        this.formPayPalUserId = formPayPalUserId;
    }

    public Long getToCountryId() {
        return toCountryId;
    }

    public void setToCountryId(Long toCountryId) {
        this.toCountryId = toCountryId;
    }

    public Long getToPayPalUserId() {
        return toPayPalUserId;
    }

    public void setToPayPalUserId(Long toPayPalUserId) {
        this.toPayPalUserId = toPayPalUserId;
    }
}
