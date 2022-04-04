package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderSendCouponRecord;

public interface OrderSendCouponRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderSendCouponRecord record);

    int insertSelective(OrderSendCouponRecord record);

    OrderSendCouponRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderSendCouponRecord record);

    int updateByPrimaryKey(OrderSendCouponRecord record);
}