package com.bysen.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName PaymentConsulController
 * @Author Bysen
 * @Date 2020/10/8 16:20
 * @Description TODO
 * @Version 1.0
 **/
@RestController
public class PaymentConsulController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentconsul(){
        return "spring cloud with consul: "+serverPort+ UUID.randomUUID().toString();
    }
}
