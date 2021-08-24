package com.jmhreif.mongocodewars;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepo extends CrudRepository<Order, Long> {

    Order findByOrderId(Long orderId);

    @Query("{ 'products.productName' : { $regex: ?0, $options: 'i' } }")
    Iterable<Order> findByProductName(String productName);
}
