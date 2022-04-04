package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverMessage;

public interface DriverMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverMessage record);

    int insertSelective(DriverMessage record);

    DriverMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverMessage record);

    int updateByPrimaryKey(DriverMessage record);
}