package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CouponSendInfo {
    private Integer id;

    /**
    * 发放数量
    */
    private Integer sendNum;

    /**
    * 开始时间
    */
    private Date startTime;

    /**
    * 结束时间
    */
    private Date endTime;

    /**
    * 操作用户
    */
    private String operatorUser;

    /**
    * 领取数量
    */
    private Integer getNum;

    /**
    * 使用数量
    */
    private Integer useNum;

    private Integer couponId;

    private Integer status;

    private String imgUrl;

    private String message;

    private String sendList;

    private Date sendTime;

    private Integer sendStatus;

    /**
    * 优惠券文案
    */
    private String description;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}