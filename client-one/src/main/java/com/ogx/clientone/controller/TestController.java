package com.ogx.clientone.controller;


import com.ogx.clientone.Object.TestObj;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
public class TestController {

    @GetMapping("/test")
    List<TestObj> getTestObjects(){

        System.err.println("ketem oo");

       return List.of(
               new TestObj("ketem", 1),
               new TestObj("chino", 2),
               new TestObj("nedu", 3)
       );
    }

}
