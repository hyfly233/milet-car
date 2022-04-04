package com.hyfly.milet.common.entity;

import lombok.Builder;
import lombok.Data;

/**
    * 充值金额规则
    */
@Data
@Builder
public class RechargePrice {
    /**
    * paymentID
    */
    private Integer id;

    /**
    * 充值金额
    */
    private Double amount;

    /**
    * 赠送金额
    */
    private Double reward;

    /**
    * 金额描述信息
    */
    private String desc;

    /**
    * 是否被删除 1 ：已删除 0 ：未删除
    */
    private Boolean isDeleted;
}