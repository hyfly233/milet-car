package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderRulePriceDetail;

public interface OrderRulePriceDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderRulePriceDetail record);

    int insertSelective(OrderRulePriceDetail record);

    OrderRulePriceDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderRulePriceDetail record);

    int updateByPrimaryKey(OrderRulePriceDetail record);
}