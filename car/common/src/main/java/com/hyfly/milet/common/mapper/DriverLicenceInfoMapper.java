package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.DriverLicenceInfo;

public interface DriverLicenceInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverLicenceInfo record);

    int insertSelective(DriverLicenceInfo record);

    DriverLicenceInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverLicenceInfo record);

    int updateByPrimaryKey(DriverLicenceInfo record);
}