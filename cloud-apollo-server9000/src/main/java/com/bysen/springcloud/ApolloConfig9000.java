package com.bysen.springcloud;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ApolloConfig9000
 * @Author Bysen
 * @Date 2020/10/25 19:57
 * @Description TODO
 * @Version 1.0
 **/
@SpringBootApplication
@EnableApolloConfig()
public class ApolloConfig9000 {
    public static void main(String[] args) {
        SpringApplication.run(ApolloConfig9000.class);
    }
}
