package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author 陆钱江
 * @create 2022-10-30 21:01
 */
public interface PaymentService {

    // 写
    public int create(Payment payment);

    // 读
    public Payment getPaymentById(@Param("id") long id);
}
