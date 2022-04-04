package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderPayment;

public interface OrderPaymentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderPayment record);

    int insertSelective(OrderPayment record);

    OrderPayment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderPayment record);

    int updateByPrimaryKey(OrderPayment record);
}