package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverBindChangeRecord;

public interface DriverBindChangeRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverBindChangeRecord record);

    int insertSelective(DriverBindChangeRecord record);

    DriverBindChangeRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverBindChangeRecord record);

    int updateByPrimaryKey(DriverBindChangeRecord record);
}