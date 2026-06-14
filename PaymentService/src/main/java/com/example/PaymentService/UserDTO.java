package com.example.PaymentService;

public class UserDTO {
    private Long id;
    private String userName;

    public UserDTO(Long id, String name){
        this.id = id;
        this.userName=name;
    }

    public Long getId(){
        return id;
    }

    public String getUserName(){
        return userName;
    }
}
