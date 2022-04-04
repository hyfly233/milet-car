package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverOrderMessageStatistical;

public interface DriverOrderMessageStatisticalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverOrderMessageStatistical record);

    int insertSelective(DriverOrderMessageStatistical record);

    DriverOrderMessageStatistical selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverOrderMessageStatistical record);

    int updateByPrimaryKey(DriverOrderMessageStatistical record);
}