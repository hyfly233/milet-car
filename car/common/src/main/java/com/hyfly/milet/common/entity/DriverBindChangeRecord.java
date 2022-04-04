package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 司机绑定信息变更表
    */
@Data
@Builder
public class DriverBindChangeRecord {
    private Integer id;

    /**
    * 司机ID
    */
    private Integer driverInfoId;

    /**
    * 绑定类型
    */
    private String bindTag;

    /**
    * 记录时间
    */
    private Date createTime;

    /**
    * 绑定内容
    */
    private String bindValue;

    /**
    * 0绑定,1解绑
    */
    private Byte bindType;

    /**
    * 操作人ID
    */
    private Integer operatorId;
}