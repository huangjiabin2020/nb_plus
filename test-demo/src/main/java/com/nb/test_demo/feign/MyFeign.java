package com.nb.test_demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: nb-demo
 * @description:
 * @author: HJB
 * @create: 2023-01-19 17:59
 **/
@FeignClient("test-provider")
public interface MyFeign {
    @RequestMapping("/get")
    public Object get();
}
