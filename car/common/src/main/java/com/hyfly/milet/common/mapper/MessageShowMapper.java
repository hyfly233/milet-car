package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.MessageShow;

public interface MessageShowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageShow record);

    int insertSelective(MessageShow record);

    MessageShow selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageShow record);

    int updateByPrimaryKey(MessageShow record);
}