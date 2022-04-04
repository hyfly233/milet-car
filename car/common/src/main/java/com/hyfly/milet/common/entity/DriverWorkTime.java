package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 司机工作时间
    */
@Data
@Builder
public class DriverWorkTime {
    private Integer id;

    /**
    * 司机id
    */
    private Integer driverId;

    /**
    * 工作开始时间
    */
    private Date workStart;

    /**
    * 工作结束时间
    */
    private Date workEnd;

    /**
    * 此次工作时长
    */
    private BigDecimal workDuration;

    /**
    * 工作日
    */
    private Date workDay;
}