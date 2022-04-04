package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 乘客钱包
    */
@Data
@Builder
public class PassengerWallet {
    private Integer id;

    /**
    * 乘客Id
    */
    private Integer passengerInfoId;

    /**
    * 本金
    */
    private Double capital;

    /**
    * 赠费
    */
    private Double giveFee;

    /**
    * 冻结本金
    */
    private Double freezeCapital;

    /**
    * 冻结赠费
    */
    private Double freezeGiveFee;

    /**
    * 创建时间
    */
    private Date createTime;

    private Date updateTime;
}