package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.BaseInfoCompany;

public interface BaseInfoCompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseInfoCompany record);

    int insertSelective(BaseInfoCompany record);

    BaseInfoCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseInfoCompany record);

    int updateByPrimaryKey(BaseInfoCompany record);
}