package com.ogx.clientwo.controller;


import com.ogx.clientwo.Object.TestObj;
import com.ogx.clientwo.feign.ClientOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController

public class TestController {


    @Autowired
    ClientOne clientOne;

    @GetMapping("/getTestOne")
    List<TestObj> getTestObjects(){
        List<TestObj> getOne = clientOne.getClientOneTest();
        return getOne;

    }

}
