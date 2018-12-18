package com.xxlllq.consumerserver.controller;

import com.xxlllq.consumerserver.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    //    @Autowired
//    private ProducerRemote producerRemote;
//
//    @GetMapping("/")
//    public String get() {
//        return "Consumer: " + producerRemote.get();
//    }
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/hello")
    public String hello() {
        return restTemplate.getForEntity("http://producer-server/", String.class).getBody();
    }
}