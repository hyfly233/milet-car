package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerMessage {
    private Integer id;

    private Integer passengerInfoId;

    private String content;

    private Byte ifSuccess;

    private Date createTime;

    private Date updateTime;
}