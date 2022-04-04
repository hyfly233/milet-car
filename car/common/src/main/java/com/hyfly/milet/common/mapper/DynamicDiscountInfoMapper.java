package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DynamicDiscountInfo;

public interface DynamicDiscountInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DynamicDiscountInfo record);

    int insertSelective(DynamicDiscountInfo record);

    DynamicDiscountInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DynamicDiscountInfo record);

    int updateByPrimaryKey(DynamicDiscountInfo record);
}