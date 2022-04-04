package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 网约车平台公司支付信息
    */
@Data
@Builder
public class BaseInfoCompanyPay {
    private Integer id;

    /**
    * 银行或非银行支付机构名称
    */
    private String payName;

    /**
    * 非银行支付机构支付业务许可证编号
    */
    private String payId;

    /**
    * 支付业务类型
    */
    private String payType;

    /**
    * 业务覆盖范围
    */
    private String payScope;

    /**
    * 备付金存管银行
    */
    private String prepareBank;

    /**
    * 结算周期（天）
    */
    private Integer countDate;

    /**
    * 状态0有效，1失效
    */
    private Integer state;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}