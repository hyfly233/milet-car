package com.hyfly.milet.common.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderPoints {
    private Integer id;

    /**
    * 司机Id
    */
    private Integer driverId;

    /**
    * 车辆Id
    */
    private Integer carId;

    /**
    * 订单id
    */
    private Integer orderId;

    private String points;
}