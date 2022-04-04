package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerConsumeRecord;

public interface PassengerConsumeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerConsumeRecord record);

    int insertSelective(PassengerConsumeRecord record);

    PassengerConsumeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerConsumeRecord record);

    int updateByPrimaryKey(PassengerConsumeRecord record);
}