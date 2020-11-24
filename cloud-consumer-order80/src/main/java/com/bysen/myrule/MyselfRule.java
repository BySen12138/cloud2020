package com.bysen.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyselfRule
 * @Author Bysen
 * @Date 2020/10/11 20:27
 * @Description 替换Ribbon负载均衡规则
 * @Version 1.0
 **/
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//替换为随机
    }
}
