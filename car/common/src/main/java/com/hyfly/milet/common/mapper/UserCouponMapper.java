package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.UserCoupon;

public interface UserCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCoupon record);

    int insertSelective(UserCoupon record);

    UserCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCoupon record);

    int updateByPrimaryKey(UserCoupon record);
}