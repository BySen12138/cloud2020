package com.bysen.springcloud.controller;

import com.bysen.springcloud.po.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Author Bysen
 * @Date 2020/9/22 21:48
 * @Description TODO
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderController {

    public static final String PAYMENT_URL = "http://cloud-consumer-consul-order";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String create(Payment payment){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/consul",String.class);
    }
}
