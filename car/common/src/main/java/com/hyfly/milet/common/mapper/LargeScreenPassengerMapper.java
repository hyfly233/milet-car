package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.LargeScreenPassenger;

public interface LargeScreenPassengerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LargeScreenPassenger record);

    int insertSelective(LargeScreenPassenger record);

    LargeScreenPassenger selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LargeScreenPassenger record);

    int updateByPrimaryKey(LargeScreenPassenger record);
}