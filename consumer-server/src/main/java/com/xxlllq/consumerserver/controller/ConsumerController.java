package com.xxlllq.consumerserver.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.xxlllq.consumerserver.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private ProducerRemote producerRemote;
//
//    @GetMapping("/")
//    public String get() {
//        return "Consumer: " + producerRemote.get();
//    }

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return producerRemote.sayHiFromClientOne(name);
    }
}