package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.BaseInfoCompanyService;

public interface BaseInfoCompanyServiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseInfoCompanyService record);

    int insertSelective(BaseInfoCompanyService record);

    BaseInfoCompanyService selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseInfoCompanyService record);

    int updateByPrimaryKey(BaseInfoCompanyService record);
}