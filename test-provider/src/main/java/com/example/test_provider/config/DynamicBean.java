package com.example.test_provider.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @program: nb-demo
 * @description:
 * @author: HJB
 * @create: 2023-01-19 15:07
 **/
@Configuration
@RefreshScope
@Data
public class DynamicBean {

    @Value("${key:key}")
    private String key;
    @Value("${value:123}")
    private String value;

}
