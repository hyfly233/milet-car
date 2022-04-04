package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarLevel;

public interface CarLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarLevel record);

    int insertSelective(CarLevel record);

    CarLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarLevel record);

    int updateByPrimaryKey(CarLevel record);
}