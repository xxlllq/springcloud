package com.xxlllq.consumerserver.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "producer-server", fallback = ProducerRemoteHystrix.class)
public interface ProducerRemote {
    @GetMapping("/")
    String get();

}