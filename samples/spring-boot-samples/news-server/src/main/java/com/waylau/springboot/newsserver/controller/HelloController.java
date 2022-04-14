package com.waylau.springboot.newsserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello World 控制器
 * @author <a href="https://waylau.com">Way Lau</a>
 * @date 2022年4月14日
 */
@RequestMapping("/admins")
@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String hello() {
        return "Hello World!";
    }
}