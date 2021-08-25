package com.jmhreif.mongocodewars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Long productId;

    private String productName;
    @Field("quantityOrdered")
    private Integer quantity;
    private double unitPrice, discount;
}
