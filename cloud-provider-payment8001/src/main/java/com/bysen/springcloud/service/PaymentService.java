package com.bysen.springcloud.service;

import com.bysen.springcloud.po.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);
}
