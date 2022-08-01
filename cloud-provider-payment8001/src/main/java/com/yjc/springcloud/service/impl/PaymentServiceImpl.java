package com.yjc.springcloud.service.impl;


import com.yjc.springcloud.dao.PaymentDao;
import com.yjc.springcloud.entities.Payment;
import com.yjc.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource //java自带的依赖注入
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
