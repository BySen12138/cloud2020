package com.bysen.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Author Bysen
 * @Date 2020/10/14 23:16
 * @Description TODO
 * @Version 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-------------PaymentFallbackService------------";
    }

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-------------PaymentFallbackService------------";
    }
}
