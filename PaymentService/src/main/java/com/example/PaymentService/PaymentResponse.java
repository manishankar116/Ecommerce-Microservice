package com.example.PaymentService;

public class PaymentResponse {
    private Long paymentId;
    private String product;
    private String userName;

    public PaymentResponse(String userName, String product, Long paymentId) {
        this.userName = userName;
        this.product = product;
        this.paymentId = paymentId;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
