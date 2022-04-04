package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 司机处罚表
    */
@Data
@Builder
public class DriverPunish {
    private Integer id;

    /**
    * 司机id
    */
    private Integer driverId;

    /**
    * 处罚时间
    */
    private Date punishTime;

    /**
    * 处罚原因
    */
    private String punishReason;

    /**
    * 处罚结果
    */
    private String punishResult;
}