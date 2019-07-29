package com.yao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * Hello world!
 *
 */
    @SpringBootApplication
    @EnableZuulProxy
    public class Zuul9527
    {
        public static void main( String[] args )
        {
            SpringApplication.run(Zuul9527.class);
        }
    }
