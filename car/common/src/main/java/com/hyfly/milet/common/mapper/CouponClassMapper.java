package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CouponClass;

public interface CouponClassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponClass record);

    int insertSelective(CouponClass record);

    CouponClass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponClass record);

    int updateByPrimaryKey(CouponClass record);
}