package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerHistoryCarPerson {
    private Integer id;

    /**
    * 订车人id
    */
    private Integer passengerInfoId;

    /**
    * 订车人用户phone
    */
    private String passengerPhone;

    /**
    * 用车人姓名
    */
    private String useCarPersonName;

    /**
    * 用车人电话
    */
    private String useCarPersonPhone;

    /**
    * 是否删除 0 未删除 1删除 
    */
    private String isDel;

    private Date createTime;

    private Date updateTime;
}