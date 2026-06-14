package com.example.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {


    private final UserClient userClient;

    public OrderController(UserClient userClient){
        this.userClient = userClient;
    }

    @GetMapping("/{id}")
    public OrderResponse getOrder(@PathVariable Long id){
        UserDTO user = userClient.getUser(1L);

        return new OrderResponse(id, "MacBook Pro", user.getName());
    }
}
