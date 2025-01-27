package com.example.orderservice.model;

import java.util.List;

public record Order(
        long id,
        OrderStatus status,
        List<Product> products,
        User user
){
}
