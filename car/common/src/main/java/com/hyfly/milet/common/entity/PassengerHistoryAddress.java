package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PassengerHistoryAddress {
    private Integer id;

    /**
    * 乘客id
    */
    private Integer passengerInfoId;

    /**
    * 乘客电话
    */
    private String passengerPhone;

    /**
    * 1上车地点
2下车地点
    */
    private Integer type;

    /**
    * 详细地址
    */
    private String address;

    /**
    * 城市码
    */
    private String cityCode;

    /**
    * 城市
    */
    private String city;

    /**
    * 地址短名
    */
    private String detailName;

    /**
    * 地址码
    */
    private String adCode;

    /**
    * 经度
    */
    private String longitude;

    /**
    * 纬度
    */
    private String latitude;

    private String addressPoi;

    /**
    * 是否被删除0未删除 1删除
    */
    private String isDel;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}