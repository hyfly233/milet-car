package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DriverMessage {
    private Integer id;

    private Integer passengerId;

    private Integer driverId;

    private String content;

    /**
    * 1:删除，0：未删除
    */
    private Integer isDelete;

    private Date createTime;

    /**
    * 是否发送成功
    */
    private Integer ifSuccess;

    /**
    * 订单id
    */
    private String orderId;

    /**
    * 消息类型
    */
    private Integer messageType;

    /**
    * 1：极光推送，2：短信
    */
    private Integer messageChannel;
}