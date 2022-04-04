package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarDispatchCapacitySet;

public interface CarDispatchCapacitySetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarDispatchCapacitySet record);

    int insertSelective(CarDispatchCapacitySet record);

    CarDispatchCapacitySet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarDispatchCapacitySet record);

    int updateByPrimaryKey(CarDispatchCapacitySet record);
}