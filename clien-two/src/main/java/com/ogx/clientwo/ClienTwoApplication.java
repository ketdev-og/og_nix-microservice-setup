package com.ogx.clientwo;

import com.ogx.clientwo.Object.TestObj;
import com.ogx.clientwo.feign.ClientOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@EnableFeignClients
public class ClienTwoApplication {


    public static void main(String[] args) {
        SpringApplication.run(ClienTwoApplication.class, args);



    }

}
