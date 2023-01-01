package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 陆钱江
 * @create 2022-10-30 18:32
 */
@Mapper
public interface PaymentDao {

    // 写
    public int create(Payment payment);

    // 读
    public Payment getPaymentById(@Param("id") long id);
}
