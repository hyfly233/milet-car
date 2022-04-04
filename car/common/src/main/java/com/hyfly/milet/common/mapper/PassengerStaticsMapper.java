package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerStatics;

public interface PassengerStaticsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerStatics record);

    int insertSelective(PassengerStatics record);

    PassengerStatics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerStatics record);

    int updateByPrimaryKey(PassengerStatics record);
}