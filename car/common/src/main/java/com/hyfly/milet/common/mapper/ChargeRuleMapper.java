package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.ChargeRule;

public interface ChargeRuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChargeRule record);

    int insertSelective(ChargeRule record);

    ChargeRule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChargeRule record);

    int updateByPrimaryKey(ChargeRule record);
}