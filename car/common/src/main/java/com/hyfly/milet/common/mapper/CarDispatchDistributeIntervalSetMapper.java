package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarDispatchDistributeIntervalSet;

public interface CarDispatchDistributeIntervalSetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarDispatchDistributeIntervalSet record);

    int insertSelective(CarDispatchDistributeIntervalSet record);

    CarDispatchDistributeIntervalSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarDispatchDistributeIntervalSet record);

    int updateByPrimaryKey(CarDispatchDistributeIntervalSet record);
}