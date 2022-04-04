package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 用户黑名单
    */
@Data
@Builder
public class PassengerBlacklist {
    private Integer id;

    /**
    * 电话号码
    */
    private String phone;

    /**
    * 1 个人用户1小时内连续取消订单3次
2 24小时内取消10次派车成功单
    */
    private String reason;

    /**
    * 1 临时黑名单 2 永久黑名单
    */
    private String category;

    /**
    * 1 解禁，0 未解禁
    */
    private String isRelease;

    /**
    * 解禁时间
    */
    private Date releaseTime;

    /**
    * create
    */
    private Date createTime;

    /**
    * update
    */
    private Date updateTime;
}