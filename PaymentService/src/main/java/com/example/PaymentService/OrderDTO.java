package com.example.PaymentService;

public class OrderDTO {
    private Long orderId;
    private String product;

    public OrderDTO(Long orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }
}
