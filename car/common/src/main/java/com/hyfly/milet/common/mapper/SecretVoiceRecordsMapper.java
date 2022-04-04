package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.SecretVoiceRecords;

public interface SecretVoiceRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SecretVoiceRecords record);

    int insertSelective(SecretVoiceRecords record);

    SecretVoiceRecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SecretVoiceRecords record);

    int updateByPrimaryKey(SecretVoiceRecords record);
}