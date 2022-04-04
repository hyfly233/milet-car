package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverWorkTime;

public interface DriverWorkTimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverWorkTime record);

    int insertSelective(DriverWorkTime record);

    DriverWorkTime selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverWorkTime record);

    int updateByPrimaryKey(DriverWorkTime record);
}