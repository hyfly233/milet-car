package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.SmsSendApp;

public interface SmsSendAppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmsSendApp record);

    int insertSelective(SmsSendApp record);

    SmsSendApp selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsSendApp record);

    int updateByPrimaryKey(SmsSendApp record);
}