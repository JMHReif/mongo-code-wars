package com.jmhreif.mongocodewars;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/")
    public Iterable<Order> findAllOrders() { return orderService.findAllOrders(); }

    @GetMapping("/findorderbyid")
    public Order findByOrderId(Long orderId) {
        return orderService.findOrderByOrderId(orderId);
    }

    @GetMapping("/findordersbyproduct")
    public Iterable<Order> findOrdersByOrderedProductsContaining(String productName) { return orderService.findOrdersByOrderedProductsContaining(productName); }
}
