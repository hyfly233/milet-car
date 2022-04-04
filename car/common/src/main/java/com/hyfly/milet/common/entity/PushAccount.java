package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 极光id手机表
    */
@Data
@Builder
public class PushAccount {
    private Integer id;

    /**
    * 设备来源 iOS,Android
    */
    private String source;

    /**
    * 消息推送设备id
    */
    private String jpushId;

    /**
    * 系统用户号，司机、乘客用yid，大屏唯一码、车机用唯一码
    */
    private String yid;

    /**
    * 听众类型：1：别名，2：注册Id
    */
    private Integer audience;

    /**
    * 身份标记 1:乘客，2：司机，3：车机，4：大屏
    */
    private Integer identityStatus;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}