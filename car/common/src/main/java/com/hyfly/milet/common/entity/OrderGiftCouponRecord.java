package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderGiftCouponRecord {
    /**
    * ID
    */
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 疑义定单id //order_doubt表中的id
    */
    private Integer doubtId;

    /**
    * 接收用户优惠券的passenger id
    */
    private Integer passengerInfoId;

    /**
    * 优惠券类型id
    */
    private Integer couponId;

    /**
    * 用户电话
    */
    private String userPhone;

    /**
    * 优惠券类型名
    */
    private String couponName;

    /**
    * 用户优惠券id
    */
    private Integer userCouponId;

    /**
    * 优惠券金额
    */
    private Double couponAmount;

    /**
    * 优惠券有效期 文案
    */
    private String couponExpiredDate;

    /**
    * 操作人Id
    */
    private Integer operatorId;

    /**
    * 操作时间
    */
    private Date operatorTime;

    /**
    * 处理方案
    */
    private String solution;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}