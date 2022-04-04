package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerWalletFreezeRecord;

public interface PassengerWalletFreezeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerWalletFreezeRecord record);

    int insertSelective(PassengerWalletFreezeRecord record);

    PassengerWalletFreezeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerWalletFreezeRecord record);

    int updateByPrimaryKey(PassengerWalletFreezeRecord record);
}