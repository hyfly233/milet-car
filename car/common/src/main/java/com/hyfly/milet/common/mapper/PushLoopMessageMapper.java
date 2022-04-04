package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PushLoopMessage;

public interface PushLoopMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PushLoopMessage record);

    int insertSelective(PushLoopMessage record);

    PushLoopMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PushLoopMessage record);

    int updateByPrimaryKey(PushLoopMessage record);
}