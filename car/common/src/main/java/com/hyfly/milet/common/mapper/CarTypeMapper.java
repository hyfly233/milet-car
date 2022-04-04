package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarType;

public interface CarTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarType record);

    int insertSelective(CarType record);

    CarType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarType record);

    int updateByPrimaryKey(CarType record);
}