package com.hyfly.milet.common.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarBaseInfo {
    /**
    * 车辆id
    */
    private Integer id;

    /**
    * 公司标识
    */
    private String companyLogo;

    /**
    * 车辆厂牌
    */
    private String carLabel;

    /**
    * 车辆类型
    */
    private String carBaseType;

    /**
    * 车辆所有人
    */
    private String carOwner;

    /**
    * 车牌颜色
    */
    private String plateColor;

    /**
    * 发动机号电动机号
    */
    private String engineNumber;

    /**
    * 车脑品牌
    */
    private String carBrainPlate;

    /**
    * 车脑编号
    */
    private String carBrainNumber;

    /**
    * vin码
    */
    private String vinNumber;

    /**
    * 注册日期
    */
    private Date registerTime;

    /**
    * 燃料类型
    */
    private String fuelType;

    /**
    * 发动机排量
    */
    private String engineCapacity;

    /**
    * 车辆照片文件编号
    */
    private String carImgFileNumber;

    /**
    * 运输证字号
    */
    private String transportNumber;

    /**
    * 车辆运输证发证机构
    */
    private String transportIssuingAuthority;

    /**
    * 经营区域
    */
    private String businessArea;

    /**
    * 车辆运输证有效期起
    */
    private Date transportCertificateValidityStart;

    /**
    * 车辆运输证有效期止
    */
    private Date transportCertificateValidityEnd;

    /**
    * 车辆初次登记日期
    */
    private Date firstRegisterTime;

    /**
    * 车辆检修状态
    */
    private String stateOfRepair;

    /**
    * 下次年检时间
    */
    private Date nextAnnualInspectionTime;

    /**
    * 年度审核状态
    */
    private String annualAuditStatus;

    /**
    * 发票打印设备序列号
    */
    private String invoicePrintingEquipmentNumber;

    /**
    * 卫星定位装置品牌
    */
    private String gpsBrand;

    /**
    * 型号
    */
    private String gpsModel;

    /**
    * imei
    */
    private String gpsImei;

    /**
    * 安装日期
    */
    private Date gpsInstallTime;

    /**
    * 报备日期
    */
    private Date reportTime;

    /**
    * 服务类型
    */
    private String serviceType;

    /**
    * 运价类型编码
    */
    private String chargeTypeCode;

    /**
    * 车辆发票
    */
    private String carInvoiceImg;

    /**
    * 合格证
    */
    private String qualityCertificateImg;

    /**
    * 行驶证
    */
    private String vehicleLicenseImg;

    /**
    * 登记证书
    */
    private String registrationCertificateImg;

    /**
    * 完税证明
    */
    private String taxPaymentCertificateImg;

    /**
    * 汽车运输证
    */
    private String transportCertificateImg;

    /**
    * 其他一
    */
    private String otherImg1;

    /**
    * 其他二
    */
    private String otherImg2;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}