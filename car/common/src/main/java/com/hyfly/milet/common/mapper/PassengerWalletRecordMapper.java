package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerWalletRecord;

public interface PassengerWalletRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerWalletRecord record);

    int insertSelective(PassengerWalletRecord record);

    PassengerWalletRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerWalletRecord record);

    int updateByPrimaryKey(PassengerWalletRecord record);
}