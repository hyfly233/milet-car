package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverIncomeDetail;

public interface DriverIncomeDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverIncomeDetail record);

    int insertSelective(DriverIncomeDetail record);

    DriverIncomeDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverIncomeDetail record);

    int updateByPrimaryKey(DriverIncomeDetail record);
}