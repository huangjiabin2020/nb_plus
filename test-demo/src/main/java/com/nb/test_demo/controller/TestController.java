package com.nb.test_demo.controller;

import com.nb.test_demo.feign.MyFeign;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private MyFeign myFeign;
    @GetMapping("/hello")
    public String test(){
        return "hello world 你好 世界";
    }
    @GetMapping("/get")
    public Object get(){
        return myFeign.get();
    }
}
