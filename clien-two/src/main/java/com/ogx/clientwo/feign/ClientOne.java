package com.ogx.clientwo.feign;


import com.ogx.clientwo.Object.TestObj;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "CLIENT-ONE", path = "/client-one/api")
public interface ClientOne {

    @GetMapping("/test")
    public List<TestObj> getClientOneTest();
}
