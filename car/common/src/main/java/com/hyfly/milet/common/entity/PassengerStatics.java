package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import lombok.Builder;
import lombok.Data;

/**
    * 乘客统计信息表
    */
@Data
@Builder
public class PassengerStatics {
    private Integer id;

    /**
    * 用户ID
    */
    private Integer passengerInfoId;

    /**
    * 总里程
    */
    private BigDecimal totalDistance;

    /**
    * 当月里程
    */
    private BigDecimal monthDistance;

    /**
    * 充值总金额
    */
    private BigDecimal totalCharge;

    /**
    * 退款总额
    */
    private BigDecimal totalRefund;

    /**
    * 订单支付总额
    */
    private BigDecimal totalOrderPay;

    /**
    * 月订单支付总额
    */
    private BigDecimal monthOrderPay;

    /**
    * 已开票总金额
    */
    private BigDecimal totalInvoice;

    /**
    * 未开票总金额
    */
    private BigDecimal canInvoice;
}