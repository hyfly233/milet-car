package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 驾驶员荣誉信息表
    */
@Data
@Builder
public class DriverRate {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 司机ID
    */
    private Integer driverId;

    /**
    * 等级
    */
    private Integer grade;

    /**
    * 考核日期
    */
    private Date testDate;

    /**
    * 考核机构
    */
    private String testDepartment;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改时间
    */
    private Date updateTime;
}