package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderReassignmentRecord;

public interface OrderReassignmentRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderReassignmentRecord record);

    int insertSelective(OrderReassignmentRecord record);

    OrderReassignmentRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderReassignmentRecord record);

    int updateByPrimaryKey(OrderReassignmentRecord record);
}