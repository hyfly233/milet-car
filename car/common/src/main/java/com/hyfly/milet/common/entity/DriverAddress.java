package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 司机顺风地址记录表
    */
@Data
@Builder
public class DriverAddress {
    private Integer id;

    /**
    * 司机id
    */
    private Integer driverId;

    /**
    * 详细地址
    */
    private String address;

    /**
    * 地址经度
    */
    private String addressLongitude;

    /**
    * 地址纬度
    */
    private String addressLatitude;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 编辑时间
    */
    private Date updateTime;

    /**
    * 标签
    */
    private String tag;

    /**
    * 是否默认地址
    */
    private Byte isDefault;
}