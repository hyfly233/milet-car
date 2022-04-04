package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderDoubt;

public interface OrderDoubtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderDoubt record);

    int insertSelective(OrderDoubt record);

    OrderDoubt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderDoubt record);

    int updateByPrimaryKey(OrderDoubt record);
}