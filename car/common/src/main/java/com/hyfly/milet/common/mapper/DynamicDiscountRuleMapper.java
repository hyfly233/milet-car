package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DynamicDiscountRule;

public interface DynamicDiscountRuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DynamicDiscountRule record);

    int insertSelective(DynamicDiscountRule record);

    DynamicDiscountRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DynamicDiscountRule record);

    int updateByPrimaryKey(DynamicDiscountRule record);
}