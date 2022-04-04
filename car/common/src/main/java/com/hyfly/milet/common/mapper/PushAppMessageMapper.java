package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PushAppMessage;

public interface PushAppMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PushAppMessage record);

    int insertSelective(PushAppMessage record);

    PushAppMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PushAppMessage record);

    int updateByPrimaryKey(PushAppMessage record);
}