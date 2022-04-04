package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarBaseInfo;

public interface CarBaseInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarBaseInfo record);

    int insertSelective(CarBaseInfo record);

    CarBaseInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarBaseInfo record);

    int updateByPrimaryKey(CarBaseInfo record);
}