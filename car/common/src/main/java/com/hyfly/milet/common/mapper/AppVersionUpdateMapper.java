package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.AppVersionUpdate;

public interface AppVersionUpdateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppVersionUpdate record);

    int insertSelective(AppVersionUpdate record);

    AppVersionUpdate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppVersionUpdate record);

    int updateByPrimaryKey(AppVersionUpdate record);
}