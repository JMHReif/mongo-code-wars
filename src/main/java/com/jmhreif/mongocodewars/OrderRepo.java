package com.jmhreif.mongocodewars;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {

    Order findOrderByOrderId(Long orderId);

    @Query("{ 'orderedProducts.productName' : { $regex: ?0, $options: 'i' } }")
    Iterable<Order> findOrdersByOrderedProductsContaining(String productName);
}
