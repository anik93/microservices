package com.example.basket.service;

import com.example.basket.client.ProductClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class BasketService {
    private final ProductClient productClient;

    public void test(){
        Map<String, String> byId = productClient.getById(1L);
        log.info("{}", byId);
    }
}
