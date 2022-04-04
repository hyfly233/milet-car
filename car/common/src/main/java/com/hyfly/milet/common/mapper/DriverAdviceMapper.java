package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverAdvice;

public interface DriverAdviceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverAdvice record);

    int insertSelective(DriverAdvice record);

    DriverAdvice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverAdvice record);

    int updateByPrimaryKey(DriverAdvice record);
}