package com.bysen.springcloud.controller;

import com.bysen.springcloud.po.CommonResult;
import com.bysen.springcloud.po.Payment;
import com.bysen.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName OrderFeignController
 * @Author Bysen
 * @Date 2020/10/12 23:10
 * @Description TODO
 * @Version 1.0
 **/
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable(value = "id") Long id){
        return paymentFeignService.getPaymentById(id);
    }
    //超时演示
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut(){
        //默认等待一秒钟
        return paymentFeignService.paymentFeignTimeOut();
    }
}
