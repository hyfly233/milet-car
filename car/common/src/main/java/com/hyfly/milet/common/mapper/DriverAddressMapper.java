package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverAddress;

public interface DriverAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverAddress record);

    int insertSelective(DriverAddress record);

    DriverAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverAddress record);

    int updateByPrimaryKey(DriverAddress record);
}