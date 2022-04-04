package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderChangeRecord {
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 接单司机id
    */
    private Integer driverBefor;

    /**
    * 派单司机id
    */
    private Integer driverAfter;

    /**
    * 派单原因
    */
    private String reason;

    /**
    * 添加时间
    */
    private Date createTime;

    /**
    * 操作用户
    */
    private String operateUesr;

    /**
    * 其它原因
    */
    private String otherReason;
}