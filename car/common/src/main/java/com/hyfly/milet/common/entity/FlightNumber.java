package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户航班号
    */
@Data
@Builder
public class FlightNumber {
    private Integer id;

    /**
    * 航班号
    */
    private String flightNumber;

    /**
    * 航班日期
    */
    private Date flightDate;

    private Integer passengerInfoId;

    /**
    * 起点code
    */
    private String startCode;

    /**
    * 终点code
    */
    private String endCode;

    /**
    * 是否订阅：1订阅，0取消订阅
    */
    private Byte isSubscribe;

    /**
    * 创建记录日期
    */
    private Date createTime;
}