package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PeopleTag;

public interface PeopleTagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PeopleTag record);

    int insertSelective(PeopleTag record);

    PeopleTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PeopleTag record);

    int updateByPrimaryKey(PeopleTag record);
}