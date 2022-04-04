package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.PhoneMessage;

public interface PhoneMessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PhoneMessage record);

    int insertSelective(PhoneMessage record);

    PhoneMessage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PhoneMessage record);

    int updateByPrimaryKey(PhoneMessage record);
}