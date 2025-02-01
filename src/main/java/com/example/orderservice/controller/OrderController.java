package com.example.orderservice.controller;

import com.example.orderservice.model.Order;
import com.example.orderservice.service.OrderService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService orderService;

    @Value("${build.version}")
    private String buildVersion;

    @GetMapping("/getOrder")
    public String getOrder(){
        return orderService.getOrder();
    }

    @PostMapping("/createOrder")
    public ResponseEntity<String> createOrder(@RequestBody Order order){
        return ResponseEntity.ok("createOrder");
    }

    @PutMapping("/updateOrder")
    public ResponseEntity<String> updateOrder(@RequestBody Order order){
        return ResponseEntity.ok("updateOrder");
    }

    @DeleteMapping ("/deleteOrder/{orderId}")
    public ResponseEntity<String> deleteOrder(
            @PathParam("orderId") String orderId){
        throw new RuntimeException("Exception while deleting order");
    }

    @GetMapping("/version")
    public ResponseEntity<String> getCurrentVersion(){
        log.info("Current version is : {}", buildVersion);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(buildVersion);
    }
}
