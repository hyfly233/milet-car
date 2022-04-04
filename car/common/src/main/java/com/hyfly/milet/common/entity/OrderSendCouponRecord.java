package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderSendCouponRecord {
    /**
    * ID
    */
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 优惠券Id
    */
    private Integer couponId;

    /**
    * 操作人id
    */
    private Integer operator;

    /**
    * create_time
    */
    private Date createTime;

    /**
    * update_time
    */
    private Date updateTime;
}