package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.ServiceType;

public interface ServiceTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServiceType record);

    int insertSelective(ServiceType record);

    ServiceType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServiceType record);

    int updateByPrimaryKey(ServiceType record);
}