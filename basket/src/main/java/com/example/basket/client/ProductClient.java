package com.example.basket.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@FeignClient(name = "PRODUCT_SERVICE")
public interface ProductClient {
    @GetMapping("/{id}")
    Map<String, String> getById(@PathVariable Long id);
}
