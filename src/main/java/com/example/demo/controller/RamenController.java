package com.example.demo.controller;


import com.example.demo.models.OrderRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin("http://127.0.0.1:5500")
@RestController
@RequestMapping(path = "api")
public class RamenController {

    private final List<String> broths = Arrays.asList("Shoyu", "Miso", "Shio");
    private final List<String> proteins = Arrays.asList("Chicken", "Pork", "Tofu");

    @GetMapping("/broths")
    public List<String> getBroths() {
        return broths;
    }

    @GetMapping("/proteins")
    public List<String> getProteins() {
        return proteins;
    }

    @PostMapping("/order")
    public ResponseEntity<?> createOrder(@RequestBody OrderRequest orderRequest) {
        if (orderRequest.getBroth() == null || orderRequest.getProtein() == null) {
            return ResponseEntity.badRequest().body("Failed to create order");
        }

        // Simulate order creation and generate an order ID
        String orderId = UUID.randomUUID().toString();

        // Create response
        Map<String, Object> response = new HashMap<>();
        response.put("orderId", orderId);
        response.put("message", "Order created successfully");
        response.put("broth", orderRequest.getBroth());
        response.put("protein", orderRequest.getProtein());

        return ResponseEntity.ok(response);
    }

}
