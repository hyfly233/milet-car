package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarScreenDriver;

public interface CarScreenDriverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarScreenDriver record);

    int insertSelective(CarScreenDriver record);

    CarScreenDriver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarScreenDriver record);

    int updateByPrimaryKey(CarScreenDriver record);
}