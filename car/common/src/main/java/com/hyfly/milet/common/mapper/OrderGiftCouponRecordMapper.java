package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderGiftCouponRecord;

public interface OrderGiftCouponRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderGiftCouponRecord record);

    int insertSelective(OrderGiftCouponRecord record);

    OrderGiftCouponRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderGiftCouponRecord record);

    int updateByPrimaryKey(OrderGiftCouponRecord record);
}