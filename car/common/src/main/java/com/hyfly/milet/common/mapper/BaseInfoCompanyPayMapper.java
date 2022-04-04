package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.BaseInfoCompanyPay;

public interface BaseInfoCompanyPayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BaseInfoCompanyPay record);

    int insertSelective(BaseInfoCompanyPay record);

    BaseInfoCompanyPay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BaseInfoCompanyPay record);

    int updateByPrimaryKey(BaseInfoCompanyPay record);
}