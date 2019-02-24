package com.jmhreif.mongocodewars;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrderService {
    private final OrderRepo orderRepo;

    public Iterable<Order> findAllOrders() { return orderRepo.findAll(); }

    public Order findOrderByOrderId(Long orderId) { return orderRepo.findOrderByOrderId(orderId); }

    public Iterable<Order> findOrdersByOrderedProductsContaining(String productName) { return orderRepo.findOrdersByOrderedProductsContaining(productName); }
}
