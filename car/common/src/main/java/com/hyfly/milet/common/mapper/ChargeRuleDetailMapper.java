package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.ChargeRuleDetail;

public interface ChargeRuleDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChargeRuleDetail record);

    int insertSelective(ChargeRuleDetail record);

    ChargeRuleDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChargeRuleDetail record);

    int updateByPrimaryKey(ChargeRuleDetail record);
}