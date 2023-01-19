package com.example.test_provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: nb-demo
 * @description:
 * @author: HJB
 * @create: 2023-01-19 11:02
 **/
@RestController
@RequestMapping("/test")
@RefreshScope
public class ProviderController {
    @Value("${useLocalCache}")
    private boolean useLocalCache;

    @Value("${user}")
    private String user;



    @RequestMapping("/get")
    public Object get() {
        return useLocalCache+":"+user;
    }
}
