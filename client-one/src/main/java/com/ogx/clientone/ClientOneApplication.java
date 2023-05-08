package com.ogx.clientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientOneApplication.class, args);
    }

}
