package com.xxlllq.producerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProducerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerServerApplication.class, args);
    }

}

