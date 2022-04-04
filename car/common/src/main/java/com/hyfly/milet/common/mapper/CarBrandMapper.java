package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarBrand;

public interface CarBrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarBrand record);

    int insertSelective(CarBrand record);

    CarBrand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarBrand record);

    int updateByPrimaryKey(CarBrand record);
}