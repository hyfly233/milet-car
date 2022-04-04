package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PushMessageRecord;

public interface PushMessageRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PushMessageRecord record);

    int insertSelective(PushMessageRecord record);

    PushMessageRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PushMessageRecord record);

    int updateByPrimaryKey(PushMessageRecord record);
}