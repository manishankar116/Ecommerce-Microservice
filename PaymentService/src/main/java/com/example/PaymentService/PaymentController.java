package com.example.PaymentService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final OrderClient orderClient;
    private final UserClient userClient;

    public PaymentController(OrderClient orderClient, UserClient userClient){
        this.userClient = userClient;
        this.orderClient =orderClient;
    }

    @GetMapping("/{id}")
    public PaymentResponse getPayment(@PathVariable Long id, @RequestParam Long userId, @RequestParam Long productId){
        UserDTO user = userClient.getUser(userId);
        OrderDTO order = orderClient.getOrder(productId);

        return new PaymentResponse(user.getUserName(), order.getProduct(), id);
    }


}
