package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerBlacklist;

public interface PassengerBlacklistMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerBlacklist record);

    int insertSelective(PassengerBlacklist record);

    PassengerBlacklist selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerBlacklist record);

    int updateByPrimaryKey(PassengerBlacklist record);
}