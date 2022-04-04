package com.hyfly.milet.common.entity;

import lombok.Builder;
import lombok.Data;

/**
    * 司机订单及其它信息统计
    */
@Data
@Builder
public class DriverOrderMessageStatistical {
    private Integer id;

    /**
    * 司机Id
    */
    private Integer driverId;

    /**
    * 机动车驾驶证编号
    */
    private String drivingLicenceNumber;

    /**
    * 统计周期 格式为YYYYMM
    */
    private String cycle;

    /**
    * 完成订单数
    */
    private Integer orderCount;

    /**
    * 交通违章次数
    */
    private Integer trafficViolationsCount;

    /**
    * 被投诉次数
    */
    private Integer complainedCount;
}