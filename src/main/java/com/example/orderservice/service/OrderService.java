package com.example.orderservice.service;

import com.example.orderservice.config.OrderProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderProperties orderProperties;

    public String getOrder(){

        return orderProperties.getEmail() +" and "+orderProperties.getNumber();
    }
}
