package com.xxlllq.consumerserver.controller;

import com.xxlllq.consumerserver.remote.ProducerRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ProducerRemote producerRemote;

    @GetMapping("/")
    public String get() {
        return "Consumer: " + producerRemote.get();
    }

}