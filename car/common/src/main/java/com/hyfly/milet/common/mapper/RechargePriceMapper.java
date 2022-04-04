package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.RechargePrice;

public interface RechargePriceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RechargePrice record);

    int insertSelective(RechargePrice record);

    RechargePrice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RechargePrice record);

    int updateByPrimaryKey(RechargePrice record);
}