package com.yao.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shkstart
 * @create 2019-07-09 17:21
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
//        return new RoundRobinRule();  //    轮询
////        return new RandomRule_ZY();   //随机
//    }

}
