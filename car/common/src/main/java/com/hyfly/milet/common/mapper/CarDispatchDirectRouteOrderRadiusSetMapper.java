package com.hyfly.milet.common.mapper;

import com.hyfly.milet.common.entity.CarDispatchDirectRouteOrderRadiusSet;

public interface CarDispatchDirectRouteOrderRadiusSetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CarDispatchDirectRouteOrderRadiusSet record);

    int insertSelective(CarDispatchDirectRouteOrderRadiusSet record);

    CarDispatchDirectRouteOrderRadiusSet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CarDispatchDirectRouteOrderRadiusSet record);

    int updateByPrimaryKey(CarDispatchDirectRouteOrderRadiusSet record);
}