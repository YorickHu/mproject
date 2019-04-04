package com.yyy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author huyue
 * @Date 2019/3/30 5:58 PM
 * @Version 1.0
 **/
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String Hello() {
        return "Hello Spring Boot~";
    }


}
