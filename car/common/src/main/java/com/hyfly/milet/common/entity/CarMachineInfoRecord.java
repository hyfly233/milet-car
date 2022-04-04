package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarMachineInfoRecord {
    private Integer id;

    /**
    * 设备唯一号
    */
    private String carDeviceCode;

    /**
    * 累计总里程,km
    */
    private BigDecimal mileage;

    /**
    * 累计分里程
    */
    private BigDecimal subMileage;

    /**
    * 南纬或北纬  n或s
    */
    private String isNs;

    /**
    * 纬度
    */
    private String latitude;

    /**
    * 是否东经西经 e或w
    */
    private String isEw;

    /**
    * 经度
    */
    private String longitude;

    /**
    * 质量因子
    */
    private Integer qf;

    /**
    * 可使用卫星数量
    */
    private Integer satelliteNum;

    /**
    * 精度，米
    */
    private BigDecimal accuracy;

    /**
    * 卫星信号强度
    */
    private Integer gpsAccuracyStatus;

    /**
    * 海拔
    */
    private BigDecimal elevation;

    /**
    * 方向
    */
    private BigDecimal direction;

    /**
    * 剩余续航里程
    */
    private BigDecimal surplusDistance;

    /**
    * 手刹开关
    */
    private Integer parkingSw;

    /**
    * 钥匙位置
    */
    private Integer keyPos;

    /**
    * 档位信号
    */
    private Integer swGear;

    /**
    * 制动踏板位置
    */
    private Integer brkSta;

    /**
    * 瞬时车速
    */
    private Integer carSpeed;

    /**
    * 剩余电量
    */
    private BigDecimal evSoc;

    /**
    * 整车最大车速
    */
    private Integer limtSpeed;

    private Date createTime;

    private Date updateTime;
}