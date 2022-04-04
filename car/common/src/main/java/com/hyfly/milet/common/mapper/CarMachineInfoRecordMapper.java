package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarMachineInfoRecord;

public interface CarMachineInfoRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarMachineInfoRecord record);

    int insertSelective(CarMachineInfoRecord record);

    CarMachineInfoRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarMachineInfoRecord record);

    int updateByPrimaryKey(CarMachineInfoRecord record);
}