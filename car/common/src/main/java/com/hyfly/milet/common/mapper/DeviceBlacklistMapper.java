package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DeviceBlacklist;

public interface DeviceBlacklistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeviceBlacklist record);

    int insertSelective(DeviceBlacklist record);

    DeviceBlacklist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeviceBlacklist record);

    int updateByPrimaryKey(DeviceBlacklist record);
}