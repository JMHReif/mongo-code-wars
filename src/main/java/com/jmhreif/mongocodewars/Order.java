package com.jmhreif.mongocodewars;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class Order {
    @Id @NonNull
    public ObjectId _id;
    @NonNull
    private Long orderId;
    private String orderDate;

    @Field("Products")
    private List<Product> products;
}
