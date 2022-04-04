package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CallRecords;

public interface CallRecordsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CallRecords record);

    int insertSelective(CallRecords record);

    CallRecords selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CallRecords record);

    int updateByPrimaryKey(CallRecords record);
}