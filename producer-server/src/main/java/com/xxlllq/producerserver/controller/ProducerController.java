package com.xxlllq.producerserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String get() {
        return "Producer Server port: " + port;
    }

}