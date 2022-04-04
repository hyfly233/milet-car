package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarBindChangeRecord;

public interface CarBindChangeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarBindChangeRecord record);

    int insertSelective(CarBindChangeRecord record);

    CarBindChangeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarBindChangeRecord record);

    int updateByPrimaryKey(CarBindChangeRecord record);
}