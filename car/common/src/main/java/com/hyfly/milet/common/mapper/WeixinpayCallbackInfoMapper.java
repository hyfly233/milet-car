package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.WeixinpayCallbackInfo;

public interface WeixinpayCallbackInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WeixinpayCallbackInfo record);

    int insertSelective(WeixinpayCallbackInfo record);

    WeixinpayCallbackInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeixinpayCallbackInfo record);

    int updateByPrimaryKey(WeixinpayCallbackInfo record);
}