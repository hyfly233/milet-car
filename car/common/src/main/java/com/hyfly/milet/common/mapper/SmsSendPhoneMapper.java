package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.SmsSendPhone;

public interface SmsSendPhoneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmsSendPhone record);

    int insertSelective(SmsSendPhone record);

    SmsSendPhone selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsSendPhone record);

    int updateByPrimaryKey(SmsSendPhone record);
}