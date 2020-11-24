package com.bysen.springcloud.service;

import com.bysen.springcloud.config.FeignConfig;
import com.bysen.springcloud.po.CommonResult;
import com.bysen.springcloud.po.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",configuration = FeignConfig.class)
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable(value = "id") Long id);

    //测试超时时间
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeOut();
}
