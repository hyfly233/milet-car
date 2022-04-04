package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.SmsAppTemplate;

public interface SmsAppTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmsAppTemplate record);

    int insertSelective(SmsAppTemplate record);

    SmsAppTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsAppTemplate record);

    int updateByPrimaryKey(SmsAppTemplate record);
}