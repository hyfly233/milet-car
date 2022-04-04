package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderPoints;

public interface OrderPointsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderPoints record);

    int insertSelective(OrderPoints record);

    OrderPoints selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderPoints record);

    int updateByPrimaryKey(OrderPoints record);
}