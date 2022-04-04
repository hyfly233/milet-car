package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrderRuleMirror;

public interface OrderRuleMirrorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderRuleMirror record);

    int insertSelective(OrderRuleMirror record);

    OrderRuleMirror selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderRuleMirror record);

    int updateByPrimaryKey(OrderRuleMirror record);
}