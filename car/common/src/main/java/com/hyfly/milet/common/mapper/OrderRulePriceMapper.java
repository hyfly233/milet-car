package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderRulePrice;

public interface OrderRulePriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderRulePrice record);

    int insertSelective(OrderRulePrice record);

    OrderRulePrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderRulePrice record);

    int updateByPrimaryKey(OrderRulePrice record);
}