package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CouponActivity;

public interface CouponActivityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponActivity record);

    int insertSelective(CouponActivity record);

    CouponActivity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponActivity record);

    int updateByPrimaryKey(CouponActivity record);
}