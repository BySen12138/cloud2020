package com.bysen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName payment8001
 * @Author Bysen
 * @Date 2020/9/17 23:01
 * @Description TODO
 * @Version 1.0
 **/
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
public class Payment8003 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8003.class);
    }
}
