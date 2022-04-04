package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.FenceInfo;

public interface FenceInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FenceInfo record);

    int insertSelective(FenceInfo record);

    FenceInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FenceInfo record);

    int updateByPrimaryKey(FenceInfo record);
}