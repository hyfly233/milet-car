package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarDispatchDistributeSet;

public interface CarDispatchDistributeSetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarDispatchDistributeSet record);

    int insertSelective(CarDispatchDistributeSet record);

    CarDispatchDistributeSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarDispatchDistributeSet record);

    int updateByPrimaryKey(CarDispatchDistributeSet record);
}