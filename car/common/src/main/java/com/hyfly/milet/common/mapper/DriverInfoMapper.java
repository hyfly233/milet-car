package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverInfo;

public interface DriverInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverInfo record);

    int insertSelective(DriverInfo record);

    DriverInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverInfo record);

    int updateByPrimaryKey(DriverInfo record);
}