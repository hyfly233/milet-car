package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PushAccount;

public interface PushAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PushAccount record);

    int insertSelective(PushAccount record);

    PushAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PushAccount record);

    int updateByPrimaryKey(PushAccount record);
}