package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 订单计费规则镜像表
    */
@Data
@Builder
public class OrderRuleMirror {
    private Integer id;

    /**
    * 订单_id
    */
    private Integer orderId;

    /**
    * 计价规则id
    */
    private Integer ruleId;

    /**
    * 规则镜像的json
    */
    private String rule;

    private Date createTime;

    private Date updateTime;
}