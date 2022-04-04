package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.EvaluateDriver;

public interface EvaluateDriverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EvaluateDriver record);

    int insertSelective(EvaluateDriver record);

    EvaluateDriver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EvaluateDriver record);

    int updateByPrimaryKey(EvaluateDriver record);
}