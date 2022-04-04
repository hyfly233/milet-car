package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerInfo;

public interface PassengerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerInfo record);

    int insertSelective(PassengerInfo record);

    PassengerInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerInfo record);

    int updateByPrimaryKey(PassengerInfo record);
}