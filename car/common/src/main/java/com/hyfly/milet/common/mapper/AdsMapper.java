package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.Ads;

public interface AdsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ads record);

    int insertSelective(Ads record);

    Ads selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ads record);

    int updateByPrimaryKey(Ads record);
}