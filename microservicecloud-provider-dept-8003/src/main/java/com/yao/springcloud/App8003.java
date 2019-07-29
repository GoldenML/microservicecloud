package com.yao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient//本服务开启后会自动注册如Eureka
@EnableDiscoveryClient//服务发现
public class App8003
{
    public static void main( String[] args )
    {
        SpringApplication.run(App8003.class,args);
    }
}
