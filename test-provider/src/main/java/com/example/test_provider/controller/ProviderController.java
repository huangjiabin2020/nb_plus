package com.example.test_provider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Value("${user:123}")
    private String user;

    @Autowired
    @Qualifier("dynamicBean")
    private Object myBean;

    @RequestMapping("/get")
    @SentinelResource(value = "resource",blockHandler = "exceptionHandler")
    public Object get() {
        return useLocalCache+":"+user;
    }
    @RequestMapping("/getBean")
    public Object getBean() {
        return JSON.toJSONString(myBean);
    }



    public String exceptionHandler(long s, BlockException ex) {
        // Do some log here.
        ex.printStackTrace();
        return "Oops, error occurred at " + s;
    }
}
