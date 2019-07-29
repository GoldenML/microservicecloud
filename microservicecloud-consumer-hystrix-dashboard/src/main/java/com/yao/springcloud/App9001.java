package com.yao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
public class App9001
{
    public static void main( String[] args )
    {
        SpringApplication.run(App9001.class);
    }
}
