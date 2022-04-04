package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarType {
    private Integer id;

    /**
    * 品牌
    */
    private String brand;

    /**
    * 型号
    */
    private String model;

    /**
    * 座位数量
    */
    private Byte seats;

    /**
    * 城市
    */
    private String city;

    private String typeDesc;

    /**
    * 车型图片地址
    */
    private String imgUrl;

    /**
    * 0：未启用，1：已启用
    */
    private Integer status;

    /**
    * 录入时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;

    /**
    * 操作人
    */
    private Integer operatorId;
}