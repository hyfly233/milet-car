package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderAdjustRecord;

public interface OrderAdjustRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderAdjustRecord record);

    int insertSelective(OrderAdjustRecord record);

    OrderAdjustRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderAdjustRecord record);

    int updateByPrimaryKey(OrderAdjustRecord record);
}