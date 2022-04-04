package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 人群标签
    */
@Data
@Builder
public class PeopleTag {
    private Integer id;

    /**
    * 人群标签名称
    */
    private String tagName;

    /**
    * 目标类别 (1,passenger, 2,driver)
    */
    private Byte tagType;

    /**
    * 筛选条件
    */
    private String tagConditions;

    /**
    * 标签人数(约数)
    */
    private Integer tagNumber;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 更新人id
    */
    private Integer operatorId;
}