package com.yzx.springwebsocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringwebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringwebsocketApplication.class, args);
    }

}
