package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PassengerWallet;

public interface PassengerWalletMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PassengerWallet record);

    int insertSelective(PassengerWallet record);

    PassengerWallet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PassengerWallet record);

    int updateByPrimaryKey(PassengerWallet record);
}