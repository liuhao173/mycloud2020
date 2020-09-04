package com.liuhao.springcloud.service.impl;

import com.liuhao.springcloud.dao.PaymentDao;
import com.liuhao.springcloud.entities.Payment;
import com.liuhao.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}
