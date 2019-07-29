package com.yao.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by haojunjie on 2019/7/26
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
//        return new RoundRobinRule();  //轮询
        return new RandomRule_ZY();   //随机
    }
}
