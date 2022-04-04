package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CouponConditions;

public interface CouponConditionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponConditions record);

    int insertSelective(CouponConditions record);

    CouponConditions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponConditions record);

    int updateByPrimaryKey(CouponConditions record);
}