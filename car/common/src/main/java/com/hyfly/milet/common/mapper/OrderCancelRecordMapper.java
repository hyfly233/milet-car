package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderCancelRecord;

public interface OrderCancelRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderCancelRecord record);

    int insertSelective(OrderCancelRecord record);

    OrderCancelRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderCancelRecord record);

    int updateByPrimaryKey(OrderCancelRecord record);
}