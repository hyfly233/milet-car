package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CouponTask;

public interface CouponTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponTask record);

    int insertSelective(CouponTask record);

    CouponTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponTask record);

    int updateByPrimaryKey(CouponTask record);
}