package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerConsumeRecord {
    /**
    * id
    */
    private Integer id;

    /**
    * 消费事件
1.订单扣款
2......
    */
    private String event;

    /**
    * 消费金额
    */
    private BigDecimal monetary;

    /**
    * 交易单号
    */
    private String transactionNumber;

    private Date createTime;

    private Date updateTime;
}