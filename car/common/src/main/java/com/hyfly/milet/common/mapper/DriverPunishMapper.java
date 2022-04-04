package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverPunish;

public interface DriverPunishMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverPunish record);

    int insertSelective(DriverPunish record);

    DriverPunish selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverPunish record);

    int updateByPrimaryKey(DriverPunish record);
}