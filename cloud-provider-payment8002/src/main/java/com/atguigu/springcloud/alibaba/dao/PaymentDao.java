package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    // 写
    public int create(Payment payment);

    // 读
    public Payment getPaymentById(@Param("id") long id);
}
