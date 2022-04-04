package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DriverIncomeDetail {
    private Integer id;

    private Integer driverInfoId;

    private String orderNo;

    private BigDecimal orderMoney;

    private Date createTime;

    private BigDecimal money;

    private BigDecimal driverRatio;
}