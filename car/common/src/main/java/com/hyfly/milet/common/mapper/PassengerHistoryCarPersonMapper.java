package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerHistoryCarPerson;

public interface PassengerHistoryCarPersonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerHistoryCarPerson record);

    int insertSelective(PassengerHistoryCarPerson record);

    PassengerHistoryCarPerson selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerHistoryCarPerson record);

    int updateByPrimaryKey(PassengerHistoryCarPerson record);
}