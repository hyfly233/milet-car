package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.TvApps;

public interface TvAppsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TvApps record);

    int insertSelective(TvApps record);

    TvApps selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TvApps record);

    int updateByPrimaryKey(TvApps record);
}