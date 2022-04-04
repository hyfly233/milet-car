package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.OrganizationInfo;

public interface OrganizationInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OrganizationInfo record);

    int insertSelective(OrganizationInfo record);

    OrganizationInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrganizationInfo record);

    int updateByPrimaryKey(OrganizationInfo record);
}