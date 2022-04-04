package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.FlightNumber;

public interface FlightNumberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FlightNumber record);

    int insertSelective(FlightNumber record);

    FlightNumber selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FlightNumber record);

    int updateByPrimaryKey(FlightNumber record);
}