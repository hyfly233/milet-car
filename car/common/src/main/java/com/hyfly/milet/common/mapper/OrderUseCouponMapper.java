package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderUseCoupon;

public interface OrderUseCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderUseCoupon record);

    int insertSelective(OrderUseCoupon record);

    OrderUseCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderUseCoupon record);

    int updateByPrimaryKey(OrderUseCoupon record);
}