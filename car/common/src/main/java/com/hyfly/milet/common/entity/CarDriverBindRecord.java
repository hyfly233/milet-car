package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDriverBindRecord {
    private Integer id;

    /**
    * 司机ID
    */
    private Integer driverInfoId;

    /**
    * 车辆ID
    */
    private Integer carInfoId;

    private String operatorUser;

    /**
    * 1绑定0解绑
    */
    private Integer type;

    private Date createTime;

    /**
    * 绑定时间
    */
    private Date bindTime;

    /**
    * 解绑时间
    */
    private Date unbindTime;

    /**
    * 车辆总里程
    */
    private Integer totalMile;
}