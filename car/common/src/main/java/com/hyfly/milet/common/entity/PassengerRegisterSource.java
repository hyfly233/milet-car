package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerRegisterSource {
    private Integer id;

    private Integer passengerInfoId;

    private String registerSource;

    private String marketChannel;

    private Date createTime;

    private Date updateTime;
}