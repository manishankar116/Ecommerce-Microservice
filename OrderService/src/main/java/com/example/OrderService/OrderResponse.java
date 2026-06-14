package com.example.OrderService;

public class OrderResponse {
    private Long orderId;
    private String product;
    private String userName;

    public OrderResponse(Long id, String product, String userName){
        this.orderId = id;
        this.product=product;
        this.userName=userName;
    }

    public Long getOrderId() {return orderId;}

    public String getProduct() {return product;}

    public String getUserName() {return userName;}

}
