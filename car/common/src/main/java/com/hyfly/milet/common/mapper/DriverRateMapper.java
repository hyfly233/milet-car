package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverRate;

public interface DriverRateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverRate record);

    int insertSelective(DriverRate record);

    DriverRate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverRate record);

    int updateByPrimaryKey(DriverRate record);
}