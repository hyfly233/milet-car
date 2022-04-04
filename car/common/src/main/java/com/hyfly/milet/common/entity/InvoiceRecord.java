package com.hyfly.milet.common.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InvoiceRecord {
    /**
    * 发票ID
    */
    private Integer id;

    /**
    * 乘客ID
    */
    private Integer passengerInfoId;

    /**
    * 订单list，逗号分隔
    */
    private String orderIdList;

    /**
    * 发票总价
    */
    private BigDecimal invoicePrice;

    /**
    * 1：待开票（申请开票）,
2：待邮寄,
3：已邮寄,
4：已撤销,
    */
    private Byte invoiceStatus;

    /**
    * 发票类型：1：普票，2：专票
    */
    private Byte invoiceType;

    /**
    * 发票主体：1：个人，2：企业
    */
    private Byte invoiceBody;

    /**
    * 发票抬头
    */
    private String invoiceTitle;

    /**
    * 发票内容
    */
    private String invoiceContent;

    /**
    * 纳税人识别号
    */
    private String taxpayerId;

    /**
    * 注册地址
    */
    private String regAddress;

    /**
    * 注册电话
    */
    private String regPhone;

    /**
    * 开户银行
    */
    private String depositBank;

    /**
    * 银行账号
    */
    private String bankAccount;

    /**
    * 收件人姓名
    */
    private String receiverName;

    /**
    * 收件人电话
    */
    private String receiverPhone;

    /**
    * 收件人地址
    */
    private String receiverAddress;

    /**
    * 申请开票时间
    */
    private Date createTime;

    /**
    * 快递公司
    */
    private Byte expressCompany;

    /**
    * 快递号
    */
    private String expressNum;

    /**
    * 邮寄时间
    */
    private Date expressTime;

    /**
    * 驳回原因ID
    */
    private Byte rejectId;

    /**
    * 撤销原因
    */
    private String cancelDesc;

    /**
    * 邮件地址
    */
    private String email;

    /**
    * 发票号
    */
    private String invoiceNumber;

    /**
    * 快递公司名称
    */
    private String expressCompanyName;
}