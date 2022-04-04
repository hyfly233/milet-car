package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarDispatchTimeThresholdSet;

public interface CarDispatchTimeThresholdSetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarDispatchTimeThresholdSet record);

    int insertSelective(CarDispatchTimeThresholdSet record);

    CarDispatchTimeThresholdSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarDispatchTimeThresholdSet record);

    int updateByPrimaryKey(CarDispatchTimeThresholdSet record);
}