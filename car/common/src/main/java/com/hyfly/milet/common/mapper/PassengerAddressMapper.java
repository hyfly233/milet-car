package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerAddress;

public interface PassengerAddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerAddress record);

    int insertSelective(PassengerAddress record);

    PassengerAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerAddress record);

    int updateByPrimaryKey(PassengerAddress record);
}