package com.example.orderservice.model;

public enum OrderStatus {
    PAYMENT_PENDING,
    PAYMENT_APPROVED,
    SHIPPING,
    IN_TRANSIT,
    OUT_FOR_DELIVERY,
    DELIVERED
}
