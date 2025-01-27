package com.example.orderservice.model;

import org.springframework.http.HttpStatus;

public record ErrorResponse(HttpStatus errorCode, String errorDescription) {
}
