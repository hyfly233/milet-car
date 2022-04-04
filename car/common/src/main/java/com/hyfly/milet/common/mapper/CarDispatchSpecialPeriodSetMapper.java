package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarDispatchSpecialPeriodSet;

public interface CarDispatchSpecialPeriodSetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarDispatchSpecialPeriodSet record);

    int insertSelective(CarDispatchSpecialPeriodSet record);

    CarDispatchSpecialPeriodSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarDispatchSpecialPeriodSet record);

    int updateByPrimaryKey(CarDispatchSpecialPeriodSet record);
}