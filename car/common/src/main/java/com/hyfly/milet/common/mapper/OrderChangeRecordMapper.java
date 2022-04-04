package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderChangeRecord;

public interface OrderChangeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderChangeRecord record);

    int insertSelective(OrderChangeRecord record);

    OrderChangeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderChangeRecord record);

    int updateByPrimaryKey(OrderChangeRecord record);
}