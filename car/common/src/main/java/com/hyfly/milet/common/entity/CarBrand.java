package com.hyfly.milet.common.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarBrand {
    private Integer id;

    /**
    * 车辆品牌ID
    */
    private Integer pid;

    /**
    * 车辆品牌
    */
    private String brand;

    /**
    * 车辆型号
    */
    private String model;

    /**
    * 标准座位数量
    */
    private Byte seats;

    /**
    * 0：未删除，1：已删除
    */
    private Boolean isDelete;
}