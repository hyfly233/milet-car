package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.BaseInfoCompanyPermit;

public interface BaseInfoCompanyPermitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseInfoCompanyPermit record);

    int insertSelective(BaseInfoCompanyPermit record);

    BaseInfoCompanyPermit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseInfoCompanyPermit record);

    int updateByPrimaryKey(BaseInfoCompanyPermit record);
}