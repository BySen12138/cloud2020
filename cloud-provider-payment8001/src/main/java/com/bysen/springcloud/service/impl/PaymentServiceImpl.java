package com.bysen.springcloud.service.impl;

import com.bysen.springcloud.dao.PaymentDao;
import com.bysen.springcloud.po.Payment;
import com.bysen.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Author Bysen
 * @Date 2020/9/20 21:57
 * @Description TODO
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
       return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
