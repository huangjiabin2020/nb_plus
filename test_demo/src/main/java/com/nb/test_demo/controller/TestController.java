package com.nb.test_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nb-demo
 * @description:
 * @author: HJB
 * @create: 2023-01-18 16:29
 **/
@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping
    public String test(){
        return "hello world 你好 世界";
    }
}
