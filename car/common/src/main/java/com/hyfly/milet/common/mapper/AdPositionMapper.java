package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.AdPosition;

public interface AdPositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdPosition record);

    int insertSelective(AdPosition record);

    AdPosition selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdPosition record);

    int updateByPrimaryKey(AdPosition record);
}