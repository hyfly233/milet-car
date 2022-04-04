package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.SmsTemplate;

public interface SmsTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmsTemplate record);

    int insertSelective(SmsTemplate record);

    SmsTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsTemplate record);

    int updateByPrimaryKey(SmsTemplate record);
}