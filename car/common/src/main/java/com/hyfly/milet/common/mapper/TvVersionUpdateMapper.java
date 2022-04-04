package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.TvVersionUpdate;

public interface TvVersionUpdateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TvVersionUpdate record);

    int insertSelective(TvVersionUpdate record);

    TvVersionUpdate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TvVersionUpdate record);

    int updateByPrimaryKey(TvVersionUpdate record);
}