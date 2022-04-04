package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DynamicDiscountCity;

public interface DynamicDiscountCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DynamicDiscountCity record);

    int insertSelective(DynamicDiscountCity record);

    DynamicDiscountCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DynamicDiscountCity record);

    int updateByPrimaryKey(DynamicDiscountCity record);
}