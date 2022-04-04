package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverBaseInfo;

public interface DriverBaseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverBaseInfo record);

    int insertSelective(DriverBaseInfo record);

    DriverBaseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverBaseInfo record);

    int updateByPrimaryKey(DriverBaseInfo record);
}