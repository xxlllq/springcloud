package com.xxlllq.consumerserver.remote;

import org.springframework.stereotype.Component;

@Component
public class ProducerRemoteHystrix implements ProducerRemote {
    @Override
    public String get() {
        return "Producer Server 的服务调用失败";
    }

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry, you are fail,"+name;
    }

}