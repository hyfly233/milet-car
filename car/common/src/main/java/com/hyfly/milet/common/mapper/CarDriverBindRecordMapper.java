package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarDriverBindRecord;

public interface CarDriverBindRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarDriverBindRecord record);

    int insertSelective(CarDriverBindRecord record);

    CarDriverBindRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarDriverBindRecord record);

    int updateByPrimaryKey(CarDriverBindRecord record);
}