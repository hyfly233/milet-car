package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerMessage;

public interface PassengerMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerMessage record);

    int insertSelective(PassengerMessage record);

    PassengerMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerMessage record);

    int updateByPrimaryKey(PassengerMessage record);
}