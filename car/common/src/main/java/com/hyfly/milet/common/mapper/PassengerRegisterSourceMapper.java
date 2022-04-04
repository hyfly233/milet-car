package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerRegisterSource;

public interface PassengerRegisterSourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerRegisterSource record);

    int insertSelective(PassengerRegisterSource record);

    PassengerRegisterSource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerRegisterSource record);

    int updateByPrimaryKey(PassengerRegisterSource record);
}