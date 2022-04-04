package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.AlipayCallbackInfo;

public interface AlipayCallbackInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AlipayCallbackInfo record);

    int insertSelective(AlipayCallbackInfo record);

    AlipayCallbackInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AlipayCallbackInfo record);

    int updateByPrimaryKey(AlipayCallbackInfo record);
}