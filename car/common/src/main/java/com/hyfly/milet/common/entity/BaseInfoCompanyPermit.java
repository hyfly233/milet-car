package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 网约车平台公司经营许可证
    */
@Data
@Builder
public class BaseInfoCompanyPermit {
    private Integer id;

    /**
    * 网络预约出租汽车经营许可证号
    */
    private String certificate;

    /**
    * 经营区域
    */
    private String operationArea;

    /**
    * 公司名称
    */
    private String ownerName;

    /**
    * 发证机构名称
    */
    private String organization;

    /**
    * 有效期起
    */
    private Date startDate;

    /**
    * 有效期止
    */
    private Date stopDate;

    /**
    * 初次发证日期
    */
    private Date certifyDate;

    /**
    * 证照状态
    */
    private String state;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}