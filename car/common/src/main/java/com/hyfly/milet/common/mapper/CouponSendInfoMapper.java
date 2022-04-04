package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CouponSendInfo;

public interface CouponSendInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponSendInfo record);

    int insertSelective(CouponSendInfo record);

    CouponSendInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponSendInfo record);

    int updateByPrimaryKey(CouponSendInfo record);
}