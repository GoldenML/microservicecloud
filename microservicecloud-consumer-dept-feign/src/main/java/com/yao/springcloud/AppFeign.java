package com.yao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.yao.springcloud"})
@ComponentScan("com.yao.springcloud")
public class AppFeign
{
    public static void main( String[] args )
    {
        SpringApplication.run(AppFeign.class,args);
    }
}
