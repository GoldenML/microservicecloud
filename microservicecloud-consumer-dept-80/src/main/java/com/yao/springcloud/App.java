package com.yao.springcloud;

import com.yao.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
