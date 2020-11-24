package com.bysen.springcloud.controller;

import com.bysen.springcloud.po.CommonResult;
import com.bysen.springcloud.po.Payment;
import com.bysen.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @ClassName PaymentController
 * @Author Bysen
 * @Date 2020/9/20 22:01
 * @Description TODO
 * @Version 1.0
 **/

@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入数据："+payment);
        log.info("服务节点： "+serverPort);
        if (result>0){
            return new CommonResult(200,"插入成功",result);
        }else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        Payment payment  = paymentService.getPaymentById(id);
        log.info("查询数据："+payment);
        log.info("服务节点： "+serverPort);
        if (payment != null){
            return new CommonResult(200,"查询成功 "+serverPort,payment);
        }else {
            return new CommonResult(444,"查询失败，没有对应记录"+id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLb(){
        return serverPort;
    }
}
