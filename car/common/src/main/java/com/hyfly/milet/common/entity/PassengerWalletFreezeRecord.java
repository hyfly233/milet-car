package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 钱包冻结/解冻记录
    */
@Data
@Builder
public class PassengerWalletFreezeRecord {
    private Integer id;

    /**
    * 乘客Id
    */
    private Integer passengerInfoId;

    /**
    * 冻结本金
    */
    private Double freezeCapital;

    /**
    * 冻结赠费
    */
    private Double freezeGiveFee;

    /**
    * 订单Id
    */
    private Integer orderId;

    /**
    * 0:解冻，1：冻结
    */
    private Integer freezeStatus;

    private Date createTime;

    private Date updateTime;
}