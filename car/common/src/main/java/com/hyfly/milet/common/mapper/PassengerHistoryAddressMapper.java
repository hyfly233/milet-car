package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerHistoryAddress;

public interface PassengerHistoryAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerHistoryAddress record);

    int insertSelective(PassengerHistoryAddress record);

    PassengerHistoryAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerHistoryAddress record);

    int updateByPrimaryKey(PassengerHistoryAddress record);
}