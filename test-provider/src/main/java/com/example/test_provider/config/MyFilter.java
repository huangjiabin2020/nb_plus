package com.example.test_provider.config;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @program: nb-demo
 * @description:
 * @author: HJB
 * @create: 2023-01-19 17:46
 **/
@Component
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
