package com.yao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class App7003
{
    public static void main( String[] args )
    {
        SpringApplication.run(App7003.class,args );
    }
}
