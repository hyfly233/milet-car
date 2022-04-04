package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DriverAdvice {
    private Integer id;

    /**
    * 司机id
    */
    private Integer driverId;

    /**
    * 反馈类型
    */
    private String adviceType;

    /**
    * 反馈内容
    */
    private String adviceDesc;

    /**
    * 司机电话
    */
    private String phone;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}